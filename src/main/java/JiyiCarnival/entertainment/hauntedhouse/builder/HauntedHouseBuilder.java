package JiyiCarnival.entertainment.hauntedhouse.builder;

import JiyiCarnival.Output;

/**
 * 抽象鬼屋路线规划类
 */
public abstract class HauntedHouseBuilder {
    protected String theFirstPart;
    protected String theSecondPart;
    protected String theThirdPart;

    /**
     * 设置鬼屋路线的第一段
     */
    public abstract void setTheFirstPart();
    /**
     * 设置鬼屋路线的第二段
     */
    public abstract void setTheSecondPart();
    /**
     * 设置鬼屋路线的第三段
     */
    public abstract void setTheThirdPart();
    public HauntedHouse build(){
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "以"+theFirstPart+"的第一路段、"+theSecondPart+"的第二路段、"+theThirdPart+"的第三路段规划鬼屋路线"
        );
        return new HauntedHouse(theFirstPart,theSecondPart,theThirdPart);
    }
}
