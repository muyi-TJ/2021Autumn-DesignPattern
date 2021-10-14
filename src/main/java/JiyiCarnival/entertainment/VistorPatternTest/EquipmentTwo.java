package JiyiCarnival.entertainment.VistorPatternTest;

public class EquipmentTwo implements UncheckedEquipment {

    @Override
    public void accept(UncheckedEquipmentVisitor uncheckedEquipmentVisitor) {
        uncheckedEquipmentVisitor.visit(this);
    }
}
