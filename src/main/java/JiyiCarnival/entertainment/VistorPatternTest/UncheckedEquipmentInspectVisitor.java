package JiyiCarnival.entertainment.VistorPatternTest;

public class UncheckedEquipmentInspectVisitor implements UncheckedEquipmentVisitor {

    @Override
    public void visit(Equipment equipment) {
        System.out.println("Operating Equipment.");
    }

    @Override
    public void visit(EquipmentThree equipmentThree) {
        System.out.println("Operating EquipmentThree.");
    }

    @Override
    public void visit(EquipmentOne equipmentOne) {
        System.out.println("Operating EquipmentOne.");
    }

    @Override
    public void visit(EquipmentTwo equipmentTwo) {
        System.out.println("Operating EquipmentTwo.");
    }
}
