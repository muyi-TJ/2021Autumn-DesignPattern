package JiyiCarnival.entertainment.equipments.visitor;

public class UncheckedEquipmentInspectVisitor implements  UncheckedEquipmentVisitor{
    @Override
    public void visit(Equipment equipment)
    {
        System.out.println("开始检查所有游乐设施loading……");
//        Output.output(this.getClass().toString(),
//                "visit",
//                String.valueOf(System.identityHashCode(this)),
//                "Start inspecting equipments."
//        );
    }

    @Override
    public void visit(EquipmentOne equipmentOne)
    {
        System.out.println("开始检查旋转木马……检查完成！");
//        Output.output(this.getClass().toString(),
//                "visit",
//                String.valueOf(System.identityHashCode(this)),
//                "Inspecting EquipmentOne……Checked!"
//        );
    }

    @Override
    public void visit(EquipmentTwo equipmentTwo)
    {
        System.out.println("开始检查水上滑梯……检查完成！");
//        Output.output(this.getClass().toString(),
//                "visit",
//                String.valueOf(System.identityHashCode(this)),
//                "Inspecting EquipmentTwo……Checked!"
//        );
    }

    @Override
    public void visit(EquipmentThree equipmentThree)
    {
        System.out.println("开始检查热气球……检查完成！");
//        Output.output(this.getClass().toString(),
//                "visit",
//                String.valueOf(System.identityHashCode(this)),
//                "Inspecting EquipmentThree……Checked!"
//        );
    }
}
