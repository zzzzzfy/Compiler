package Misc.Type;

public class NullTypeDef extends SimpleTypeDef {
    public NullTypeDef() {
        typeId = "null";
    }

    @Override
    public NullTypeDef copy() {
        return new NullTypeDef();
    }

    @Override
    public boolean equals(TypeDef other) {
        return (other instanceof NullTypeDef);
    }
}
