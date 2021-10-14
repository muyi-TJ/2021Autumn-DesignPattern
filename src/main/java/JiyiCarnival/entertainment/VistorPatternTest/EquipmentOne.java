package JiyiCarnival.entertainment.VistorPatternTest;

public class EquipmentOne implements UncheckedEquipment {

    @Override
    public void accept(UncheckedEquipmentVisitor uncheckedEquipmentVisitor) {
        uncheckedEquipmentVisitor.visit(this);
    }
}