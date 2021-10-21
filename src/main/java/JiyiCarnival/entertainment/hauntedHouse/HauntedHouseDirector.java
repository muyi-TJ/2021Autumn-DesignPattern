package JiyiCarnival.entertainment.hauntedHouse;

/**
 * 指导鬼屋规划路线类
 */
public class HauntedHouseDirector {
    private HauntedHouseBuilder hauntedHouseBuilder;

    /**
     * 设置指定的建造者
     * @param hauntedHouseBuilder 特定建造者
     */
    public void setHauntedHouseBuilder(HauntedHouseBuilder hauntedHouseBuilder){
        this.hauntedHouseBuilder=hauntedHouseBuilder;
        System.out.println("设置指定的建造者");
    }

    /**
     * 指导鬼屋规划
     */
    public void construct(){
        System.out.println("指导鬼屋路线规划（将鬼屋路线分为三段）：");
        hauntedHouseBuilder.setTheFirstPart();
        hauntedHouseBuilder.setTheSecondPart();
        hauntedHouseBuilder.setTheThirdPart();
    }
}
