package JiyiCarnival.entertainment.equipments.visitor;

import JiyiCarnival.Output;

/**
 * @author swaychen0420
 * 展示未检查的设备
 * 设备名称可以在后续整合时进行更改
 */

public class UncheckedEquipmentDisplayVisitor implements UncheckedEquipmentVisitor
{

    @Override
    public void visit(Equipment equipment)
    {
        System.out.println("显示当前未检查的设备 >>");
//        Output.output(this.getClass().toString(),
//                "visit",
//                String.valueOf(System.identityHashCode(this)),
//                "Displaying equipments unchecked."
//        );
    }

    @Override
    public void visit(EquipmentOne equipmentOne)
    {
        System.out.println("旋转木马 尚未检查");
//        Output.output(this.getClass().toString(),
//                "visit",
//                String.valueOf(System.identityHashCode(this)),
//                "EquipmentOne unchecked."
//        );
    }

    @Override
    public void visit(EquipmentTwo equipmentTwo)
    {
        System.out.println("水上滑梯 尚未检查");
//        Output.output(this.getClass().toString(),
//                "visit",
//                String.valueOf(System.identityHashCode(this)),
//                "EquipmentTwo unchecked."
//        );
    }

    @Override
    public void visit(EquipmentThree equipmentThree)
    {
        System.out.println("热气球 尚未检查");
//        Output.output(this.getClass().toString(),
//                "visit",
//                String.valueOf(System.identityHashCode(this)),
//                "EquipmentThree unchecked."
//        );
    }
}