package FrontEnd;

import Misc.Scope.ClassScope;
import Misc.Scope.GlobalScope;
import Misc.Scope.LocalScope;
import Misc.Scope.Scope;
import Misc.Type.*;

public class ScopeBuilder {
    public GlobalScope<TypeDef> rootScope = new GlobalScope<>(null, "0");

    void initInterType() throws SyntaxError {
        ClassTypeDef stringType = new ClassTypeDef();
        stringType.insertObject("length", new FuncTypeDef(new IntTypeDef()));
        stringType.insertObject("substring", new FuncTypeDef(new StringTypeDef(), new IntTypeDef(), new IntTypeDef()));
        stringType.insertObject("parseInt", new FuncTypeDef(new IntTypeDef()));
        stringType.insertObject("ord", new FuncTypeDef(new IntTypeDef(), new IntTypeDef()));
        rootScope.addItem("string", stringType);

        FuncTypeDef printDef = new FuncTypeDef(new VoidTypeDef(), new StringTypeDef());
        rootScope.addItem("print", printDef);

        FuncTypeDef printlnDef = new FuncTypeDef(new VoidTypeDef(), new StringTypeDef());
        rootScope.addItem("println", printlnDef);

        FuncTypeDef getStringFunc = new FuncTypeDef(new StringTypeDef());
        rootScope.addItem("getString", getStringFunc);

        FuncTypeDef getIntFunc = new FuncTypeDef(new IntTypeDef());
        rootScope.addItem("getInt", getIntFunc);

        FuncTypeDef toStringFunc = new FuncTypeDef(new StringTypeDef(), new IntTypeDef());
        rootScope.addItem("toString", toStringFunc);
    }

    public void programScopeBuild(Node rootAST) throws SyntaxError {
        initInterType();
        scopeBuild(rootScope, rootAST);
        TypeDef MAIN = rootScope.findItem("main");
        if (!(MAIN instanceof FuncTypeDef) ||
            !(((FuncTypeDef)MAIN).getRetType() instanceof IntTypeDef)) {
            throw new NoMainFuncError(new PositionDef(0, 0));
        }
    }

    void scopeBuild(Scope<TypeDef> curScope, Node curNode) throws SyntaxError {
        curNode.belong = curScope;
        for (int i = 0 ; i < curNode.childs.size() ; ++ i) {
            Node childnode = curNode.childs.get(i);
            if (childnode instanceof ClassDefNode) {
                ClassScope<TypeDef> childScope = Scope.newClassScope(curScope);
                scopeBuild(childScope, childnode);
                ClassTypeDef classType = new ClassTypeDef(childScope.table.getHashMap(),
                        childScope.varIdx, childScope,
                        childnode.id,
                        childScope.classSize);
                if (!curScope.addItem(childnode.id, classType)) {
                    throw new ReDefinedError(childnode.pos);
                }
            } else if (childnode instanceof FunctionDefNode ||
                    childnode instanceof ConstructFuncNode) { // ClassName and FunctionName can be defined
                childnode.belong = curScope;
                FuncTypeDef funcType = new FuncTypeDef((VarTypeDef) childnode.type);
                LocalScope<TypeDef> childScope = Scope.newLocalScope(curScope);
                for (int j = 0 ; j < childnode.childs.size() - 1 ; ++ j) {
                    VarDefNode tmpChildNode = (VarDefNode)childnode.childs.get(j);
                    tmpChildNode.belong = childScope;
                    funcType.insert((VarTypeDef) tmpChildNode.type);
                }
                if (!curScope.addItem(childnode.id, funcType)) {
                    throw new ReDefinedError(childnode.pos);
                }
                localScopeBuild(childScope, childnode.childs.get(childnode.childs.size() - 1));
            } else if (childnode instanceof VarDefNode) {
                scopeBuild(curScope, childnode);
                if (curScope instanceof ClassScope) {
                    if (!curScope.addItem(childnode.id, childnode.type)) {
                        throw new ReDefinedError(childnode.pos);
                    }
                    curScope.addVar(childnode.id, childnode.type);
                }
            } else scopeBuild(curScope, childnode);
        }
    }

    void localScopeBuild(LocalScope<TypeDef> curScope, Node curNode) throws SyntaxError {
        curNode.belong = curScope;
        for (int i = 0 ; i < curNode.childs.size() ; ++ i) {
            Node childnode = curNode.childs.get(i);
           if (childnode instanceof BlockStateNode) {
                LocalScope<TypeDef> childScope = Scope.newLocalScope(curScope);
                localScopeBuild(childScope, childnode);
            } else {
                localScopeBuild(curScope, childnode);
            }
        }
    }
}
