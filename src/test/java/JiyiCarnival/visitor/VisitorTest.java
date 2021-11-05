package JiyiCarnival.visitor;

import JiyiCarnival.entertainment.equipments.visitor.Equipment;
import JiyiCarnival.entertainment.equipments.visitor.UncheckedEquipment;
import JiyiCarnival.entertainment.equipments.visitor.UncheckedEquipmentDisplayVisitorLog;
import JiyiCarnival.entertainment.equipments.visitor.UncheckedEquipmentInspectVisitorLog;
//import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class VisitorTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("访问者模式测试：");
        UncheckedEquipment equipment = new Equipment();
        equipment.accept(new UncheckedEquipmentDisplayVisitorLog());
        equipment.accept(new UncheckedEquipmentInspectVisitorLog());
    }
}
