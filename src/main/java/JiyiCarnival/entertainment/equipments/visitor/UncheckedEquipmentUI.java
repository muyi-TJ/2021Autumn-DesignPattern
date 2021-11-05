package JiyiCarnival.entertainment.equipments.visitor;

import JiyiCarnival.util.control.Controller;

public class UncheckedEquipmentUI extends Controller {
    public void flowControl() throws InterruptedException {
        UncheckedEquipment equipment = new Equipment();
        equipment.accept(new UncheckedEquipmentDisplayVisitor());
        equipment.accept(new UncheckedEquipmentInspectVisitor());
    }
}
