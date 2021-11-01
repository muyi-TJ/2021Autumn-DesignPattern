package JiyiCarnival.entertainment.equipments.visitor;

/**
 * @author swaychen0420
 * 设备类
 */

public class Equipment implements UncheckedEquipment
{

    UncheckedEquipment[] parts;

    public Equipment()
    {
        parts = new UncheckedEquipment[]{new EquipmentOne(), new EquipmentTwo(), new EquipmentThree()};
    }


    @Override
    public void accept(UncheckedEquipmentVisitor uncheckedEquipmentVisitor)
    {
        uncheckedEquipmentVisitor.visit(this);//先visit自己再for循环visit其他部分
        for (int i = 0; i < parts.length; i++)
        {
            parts[i].accept(uncheckedEquipmentVisitor);
        }

    }
}