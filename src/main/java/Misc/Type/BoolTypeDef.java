package Misc.Type;

public class BoolTypeDef extends SimpleTypeDef {
    public BoolTypeDef() {
        typeId = "bool";
    }

    @Override
    public BoolTypeDef copy() {
        return new BoolTypeDef();
    }

    @Override
    public boolean equals(TypeDef other) {
        return (other instanceof BoolTypeDef);
    }
}
