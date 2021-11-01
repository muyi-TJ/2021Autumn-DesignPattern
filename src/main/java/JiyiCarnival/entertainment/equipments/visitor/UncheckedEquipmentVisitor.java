package JiyiCarnival.entertainment.equipments.visitor;

/**
 * @author swaychen0420
 * 设备检查接口，管理人员检查相关设备
 */

public interface UncheckedEquipmentVisitor
{
    public void visit(Equipment equipment);

    public void visit(EquipmentOne equipmentOne);

    public void visit(EquipmentTwo equipmentTwo);

    public void visit(EquipmentThree equipmentThree);
}