package Misc.Type;

public class VoidTypeDef extends SimpleTypeDef {
    public VoidTypeDef() {
        typeId = "void";
    }

    @Override
    public VoidTypeDef copy() {
        return new VoidTypeDef();
    }

    @Override
    public boolean equals(TypeDef other) {
        return (other instanceof VoidTypeDef);
    }

    @Override
    public Long getSize() {
        return 0L;
    }
}
