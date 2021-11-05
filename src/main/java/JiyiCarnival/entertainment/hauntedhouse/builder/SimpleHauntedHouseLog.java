package JiyiCarnival.entertainment.hauntedhouse.builder;

public class SimpleHauntedHouseLog extends HauntedHouseBuilder{
    /**
     * 设置第一路段的等级
     */
    @Override
    public void setTheFirstPart()
    {
//        Output.output(
//                this.getClass().toString(),
//                "initialize",
//                String.valueOf(System.identityHashCode(this)),
//                "设置第一路段的难度等级为3颗星"
//        );
        this.theFirstPart = "难度等级为3颗星";
    }

    /**
     * 设置第二路段的等级
     */
    @Override
    public void setTheSecondPart()
    {
//        Output.output(
//                this.getClass().toString(),
//                "initialize",
//                String.valueOf(System.identityHashCode(this)),
//                "设置第二路段的难度等级为3颗星"
//        );
//        System.out.println("设置第二路段的难度等级为3颗星");
        this.theSecondPart = "难度等级为3颗星";
    }

    /**
     * 设置第三路段的等级
     */
    @Override
    public void setTheThirdPart()
    {
//        Output.output(
//                this.getClass().toString(),
//                "initialize",
//                String.valueOf(System.identityHashCode(this)),
//                "设置第三路段的难度等级为3颗星"
//        );
//        System.out.println("设置第三路段的难度等级为3颗星");
        this.theThirdPart = "难度等级为3颗星";
    }
}
