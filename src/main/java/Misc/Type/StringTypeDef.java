package Misc.Type;

public class StringTypeDef extends SpecialTypeDef {
    public StringTypeDef() {
        typeId = "string";
        belong = null;
    }

    @Override
    public StringTypeDef copy() {
        return new StringTypeDef();
    }

    @Override
    public boolean equals(TypeDef other) {
        return (other instanceof StringTypeDef);
    }
}
