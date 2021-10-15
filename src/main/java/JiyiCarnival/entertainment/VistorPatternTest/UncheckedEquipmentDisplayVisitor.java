package JiyiCarnival.entertainment.VistorPatternTest;

public class UncheckedEquipmentDisplayVisitor implements UncheckedEquipmentVisitor {

    @Override
    public void visit(Equipment equipment) {
        System.out.println("Displaying Equipment.");
    }

    @Override
    public void visit(EquipmentThree equipmentThree) {
        System.out.println("Displaying EquipmentThree.");
    }

    @Override
    public void visit(EquipmentOne equipmentOne) {
        System.out.println("Displaying EquipmentOne.");
    }

    @Override
    public void visit(EquipmentTwo equipmentTwo) {
        System.out.println("Displaying EquipmentTwo.");
    }
}