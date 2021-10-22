package JiyiCarnival.entertainment.equipments.visitor;

/**
 * @author swaychen0420
 * 展示未检查的设备
 * 设备名称可以在后续整合时进行更改
 */

public class UncheckedEquipmentDisplayVisitor implements UncheckedEquipmentVisitor {

    @Override
    public void visit(Equipment equipment) {
        System.out.println("Displaying equipments unchecked.");
    }

    @Override
    public void visit(EquipmentOne equipmentOne) {
        System.out.println("EquipmentOne unchecked.");
    }

    @Override
    public void visit(EquipmentTwo equipmentTwo) {
        System.out.println("EquipmentTwo unchecked.");
    }

    @Override
    public void visit(EquipmentThree equipmentThree) {
        System.out.println("EquipmentThree unchecked.");
    }
}