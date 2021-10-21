package JiyiCarnival.entertainment.hauntedHouse;

public class SimpleHauntedHouse extends HauntedHouseBuilder{
    /**
     * 设置第一路段的等级
     */
    @Override
    public void setTheFirstPart(){
        System.out.println("设置第一路段的难度等级为3颗星");
        this.theFirstPart="难度等级为3颗星";
    }
    /**
     * 设置第二路段的等级
     */
    @Override
    public void setTheSecondPart(){
        System.out.println("设置第二路段的难度等级为3颗星");
        this.theSecondPart="难度等级为3颗星";
    }
    /**
     * 设置第三路段的等级
     */
    @Override
    public void setTheThirdPart(){
        System.out.println("设置第三路段的难度等级为3颗星");
        this.theThirdPart="难度等级为3颗星";
    }
}
