package Misc.Type;

public class OtherTypeDef extends SpecialTypeDef {
    public OtherTypeDef(String typeId) {
        this.typeId = typeId;
        belong = null;
    }

    public OtherTypeDef(String typeId, ClassTypeDef blg) {
        this.typeId = typeId;
        belong = blg;
    }

    @Override
    public OtherTypeDef copy() {
        return new OtherTypeDef(typeId, belong);
    }

    @Override
    public boolean equals(TypeDef other) {
        return (other instanceof OtherTypeDef) && (((OtherTypeDef)other).typeId.equals(this.typeId));
    }
}
