import BackEnd.CodeGen;
import BackEnd.RegisterAllocater;
import Misc.Mix.Register;
import FrontEnd.*;
import Misc.Mix.LineIR;
import Misc.Scope.GlobalScope;
import Misc.Type.TypeDef;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.HashMap;

public class Main {
    static Node root;
    static LineIR lineIR;
    static HashMap<String, Node> funcNode = new HashMap<>();
    static GlobalScope<TypeDef> rootScope;
    static int cnt;

    public static void ScopeBuild() throws Exception{
        ScopeBuilder scopeBuilder = new ScopeBuilder();
        scopeBuilder.programScopeBuild(root);
        rootScope = scopeBuilder.rootScope;
    }
    public static void SemanticCheck() throws Exception{
        SemanticChecker checker = new SemanticChecker(rootScope, funcNode);
        try {
            root.accept(checker);
        } catch (SyntaxError error) {
            System.out.println(error.toString() + " on Line: " +
                    error.pos.line + ",  Column: " +
                    error.pos.column);
            throw error;
        }
    }
    public static void AstBuild(InputStream is) throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(is);
        MxStarLexer lexer = new MxStarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MxStarParser parser = new MxStarParser(tokens);
        parser.setErrorHandler(new BailErrorStrategy());

        ParseTree tree = parser.program();

        ASTBuilder buildAST = new ASTBuilder();

        root = buildAST.visit(tree);
    }
    public static void IRBuild() throws Exception{
//        System.out.println("!");
        Register.init();
        IRBuilder buildIR = new IRBuilder(rootScope, funcNode);
        lineIR = buildIR.buildLineIR(root);
//        lineIR.print();
    }
    public static void CodeGen()throws Exception {
        RegisterAllocater allocateReg = new RegisterAllocater(lineIR);
        allocateReg.work();

        CodeGen codeGenerator = new CodeGen(lineIR);
        codeGenerator.work();
    }
    public static void DumpFile(String fileName)throws Exception{
        PrintStream ps=new PrintStream(new FileOutputStream("output/"+fileName+".asm"));
        System.setOut(ps);
    }

    public static void main (String[] args) throws Exception {

        DumpFile("tst");
//        InputStream is = System.in;
        InputStream is = new FileInputStream("test.txt");
        AstBuild(is);
        ScopeBuild();
        SemanticCheck();
        IRBuild();
        CodeGen();
    }
}