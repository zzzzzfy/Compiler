package Misc.Type;

public class IntTypeDef extends SimpleTypeDef {
    public IntTypeDef() {
        typeId = "int";
    }

    @Override
    public IntTypeDef copy() {
        return new IntTypeDef();
    }

    @Override
    public boolean equals(TypeDef other) {
        return (other instanceof IntTypeDef);
    }
}
