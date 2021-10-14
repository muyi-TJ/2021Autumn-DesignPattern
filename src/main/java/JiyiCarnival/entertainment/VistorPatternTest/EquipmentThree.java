package JiyiCarnival.entertainment.VistorPatternTest;

public class EquipmentThree implements UncheckedEquipment {

    @Override
    public void accept(UncheckedEquipmentVisitor uncheckedEquipmentVisitor) {
        uncheckedEquipmentVisitor.visit(this);
    }
}
