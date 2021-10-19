package JiyiCarnival.entertainment.parade.strategy;

/**
 * @author Rounds-Chen
 *
 * 巡游路线一
 */
public class RouteOne implements ParadeRoute{

    @Override
    public void parade() {
        System.out.format("巡游路线一:\n\t旋转木马 ---> 星光大道 ---> 过山车 ---> 灵感街 ---> 纪念品商店 \n\n ");
    }
}
