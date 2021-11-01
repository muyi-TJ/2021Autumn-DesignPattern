package JiyiCarnival.entertainment.hauntedhouse.builder;

import JiyiCarnival.Output;

/**
 * 指导鬼屋规划路线类
 */
public class HauntedHouseDirector
{
    private HauntedHouseBuilder hauntedHouseBuilder;

    /**
     * 设置指定的建造者
     *
     * @param hauntedHouseBuilder 特定建造者
     */
    public void setHauntedHouseBuilder(HauntedHouseBuilder hauntedHouseBuilder)
    {
        this.hauntedHouseBuilder = hauntedHouseBuilder;
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "设置指定的建造者"
        );
    }

    /**
     * 指导鬼屋规划
     */
    public void construct()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "指导鬼屋路线规划（将鬼屋路线分为三段）："
        );
        hauntedHouseBuilder.setTheFirstPart();
        hauntedHouseBuilder.setTheSecondPart();
        hauntedHouseBuilder.setTheThirdPart();
    }
}
