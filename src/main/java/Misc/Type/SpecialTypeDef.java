package Misc.Type;

public abstract class SpecialTypeDef extends SingleTypeDef {
    ClassTypeDef belong;

    public void setBelongClass(ClassTypeDef blg) {
        belong = blg;
    }

    public ClassTypeDef getBelongClass() {
        return belong;
    }

    public Long getClassSize() {
        return belong.getSize();
    }

    @Override
    public abstract SpecialTypeDef copy();

    @Override
    public abstract boolean equals(TypeDef other);
}
