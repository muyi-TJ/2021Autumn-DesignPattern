package JiyiCarnival.entertainment.VistorPatternTest;

public class Equipment implements UncheckedEquipment {

    UncheckedEquipment[] parts;

    public Equipment(){
        parts = new UncheckedEquipment[] {new EquipmentThree(), new EquipmentOne(), new EquipmentTwo()};
    }


    @Override
    public void accept(UncheckedEquipmentVisitor uncheckedEquipmentVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(uncheckedEquipmentVisitor);
        }
        uncheckedEquipmentVisitor.visit(this);
    }
}