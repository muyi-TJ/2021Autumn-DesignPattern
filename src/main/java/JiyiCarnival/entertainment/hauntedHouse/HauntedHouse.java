package JiyiCarnival.entertainment.hauntedHouse;


/**
 * 鬼屋的Product类
 */
public class HauntedHouse {
    private final String theFirstPart;
    private final String theSecondPart;
    private final String theThirdPart;

    /**
     *
     * @param first 第一段路段
     * @param second 第二路段
     * @param third 第三路段
     */
    public HauntedHouse(String first,String second,String third){
       theFirstPart=first;
       theSecondPart=second;
       theThirdPart=third;
        System.out.println("规划出由"+theFirstPart+"的第一路段、"+theSecondPart+"的第二路段、"+theThirdPart+"的第三路段组成的鬼屋路线");
    }

    /**
     * 展示路线
     */
    public void play(){
        System.out.println("游玩了由"+theFirstPart+"的第一路段、"+theSecondPart+"的第二路段、"+theThirdPart+"的第三路段组成的鬼屋路线");
    }
}
