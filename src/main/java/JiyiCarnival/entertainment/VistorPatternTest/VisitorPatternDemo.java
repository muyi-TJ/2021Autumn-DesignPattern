package JiyiCarnival.entertainment.VistorPatternTest;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        UncheckedEquipment equipment = new Equipment();
        equipment.accept(new UncheckedEquipmentDisplayVisitor());
        equipment.accept(new UncheckedEquipmentInspectVisitor());
    }
}