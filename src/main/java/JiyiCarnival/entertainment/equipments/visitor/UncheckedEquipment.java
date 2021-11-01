package JiyiCarnival.entertainment.equipments.visitor;

/**
 * @author swaychen0420
 * 设备接口
 */

public interface UncheckedEquipment
{
    public void accept(UncheckedEquipmentVisitor uncheckedEquipmentVisitor);
}
