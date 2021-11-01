package JiyiCarnival.entertainment.equipments.visitor;

import JiyiCarnival.Output;

/**
 * @author swaychen0420
 * 顺次检查设备
 */

public class UncheckedEquipmentInspectVisitor implements UncheckedEquipmentVisitor
{

    @Override
    public void visit(Equipment equipment)
    {
//        System.out.println("Start inspecting equipments.");
        Output.output(this.getClass().toString(),
                "visit",
                String.valueOf(System.identityHashCode(this)),
                "Start inspecting equipments."
        );
    }

    @Override
    public void visit(EquipmentOne equipmentOne)
    {
//        System.out.println("Inspecting EquipmentOne……Checked!");
        Output.output(this.getClass().toString(),
                "visit",
                String.valueOf(System.identityHashCode(this)),
                "Inspecting EquipmentOne……Checked!"
        );
    }

    @Override
    public void visit(EquipmentTwo equipmentTwo)
    {
//        System.out.println("Inspecting EquipmentTwo……Checked!");
        Output.output(this.getClass().toString(),
                "visit",
                String.valueOf(System.identityHashCode(this)),
                "Inspecting EquipmentTwo……Checked!"
        );
    }

    @Override
    public void visit(EquipmentThree equipmentThree)
    {
//        System.out.println("Inspecting EquipmentThree……Checked!");
        Output.output(this.getClass().toString(),
                "visit",
                String.valueOf(System.identityHashCode(this)),
                "Inspecting EquipmentThree……Checked!"
        );
    }
}
