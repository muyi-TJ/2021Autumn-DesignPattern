package JiyiCarnival.entertainment.equipments.visitor;

/**
 * @author swaychen0420
 * 顺次检查设备
 */

public class UncheckedEquipmentInspectVisitor implements UncheckedEquipmentVisitor {

    @Override
    public void visit(Equipment equipment) {
        System.out.println("Start inspecting equipments.");
    }

    @Override
    public void visit(EquipmentOne equipmentOne) {
        System.out.println("Inspecting EquipmentOne……Checked!");
    }

    @Override
    public void visit(EquipmentTwo equipmentTwo) {
        System.out.println("Inspecting EquipmentTwo……Checked!");
    }

    @Override
    public void visit(EquipmentThree equipmentThree) {
        System.out.println("Inspecting EquipmentThree……Checked!");
    }
}
