
package Misc.Type;

public abstract class TypeDef {
    public static TypeDef build(String typeId) {
        if (typeId.contains("[")) {
            int dim = 0;
            String noArrayId = "";
            boolean flag = true;
            for (int i = 0 ; i < typeId.length() ; ++ i) {
                if (typeId.charAt(i) == '[') ++ dim;
                if (!Character.isLetter(typeId.charAt(i)) && !Character.isDigit(typeId.charAt(i)) && typeId.charAt(i) != '_' && flag == true) {
                    noArrayId = typeId.substring(0, i);
                    flag = false;
                }
            }
            return new ArrayTypeDef((VarTypeDef) build(noArrayId), dim);
        } else {
            if (typeId.equals("int")) return new IntTypeDef();
            else if (typeId.equals("bool")) return new BoolTypeDef();
            else if (typeId.equals("string")) return new StringTypeDef();
            else if (typeId.equals("void")) return new VoidTypeDef();
            else return new OtherTypeDef(typeId);
        }
    }
/*
    public boolean equalSingleType(String typeId) {
        return (this instanceof SingleTypeDef) && (((SingleTypeDef)this).typeId.equals(typeId));
    }
*/
    public abstract boolean equals(TypeDef other);

    public abstract Long getSize();
}