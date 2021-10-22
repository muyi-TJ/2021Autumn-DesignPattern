package JiyiCarnival.visitor;

import JiyiCarnival.entertainment.equipments.visitor.Equipment;
import JiyiCarnival.entertainment.equipments.visitor.UncheckedEquipment;
import JiyiCarnival.entertainment.equipments.visitor.UncheckedEquipmentDisplayVisitor;
import JiyiCarnival.entertainment.equipments.visitor.UncheckedEquipmentInspectVisitor;
import org.junit.Test;

public class VisitorTest {
    @Test
    public void test(){
        System.out.println("访问者模式测试：");
        UncheckedEquipment equipment = new Equipment();
        equipment.accept(new UncheckedEquipmentDisplayVisitor());
        equipment.accept(new UncheckedEquipmentInspectVisitor());
    }
}
