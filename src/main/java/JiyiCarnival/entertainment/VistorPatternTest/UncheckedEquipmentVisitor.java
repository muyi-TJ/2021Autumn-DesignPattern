package JiyiCarnival.entertainment.VistorPatternTest;

public interface UncheckedEquipmentVisitor {
    public void visit(Equipment equipment);
    public void visit(EquipmentThree equipmentThree);
    public void visit(EquipmentOne equipmentOne);
    public void visit(EquipmentTwo equipmentTwo);
}