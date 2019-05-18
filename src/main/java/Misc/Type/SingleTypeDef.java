package Misc.Type;

public abstract class SingleTypeDef extends VarTypeDef {
    String typeId;
    public String getTypeId() { return typeId; }

    @Override
    public Long getSize() {
        return 1L;
    }
}
