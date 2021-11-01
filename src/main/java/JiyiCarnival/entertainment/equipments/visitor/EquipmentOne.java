package JiyiCarnival.entertainment.equipments.visitor;

/**
 * @author swaychen0420
 * 设备一
 * 设备名称可以在后续整合时进行更改
 */

public class EquipmentOne implements UncheckedEquipment
{

    @Override
    public void accept(UncheckedEquipmentVisitor uncheckedEquipmentVisitor)
    {
        uncheckedEquipmentVisitor.visit(this);
    }
}