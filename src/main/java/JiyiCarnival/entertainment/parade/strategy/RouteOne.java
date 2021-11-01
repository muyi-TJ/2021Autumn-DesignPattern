package JiyiCarnival.entertainment.parade.strategy;

import JiyiCarnival.Output;

/**
 * @author Rounds-Chen
 * <p>
 * 巡游路线一
 */
public class RouteOne implements ParadeRoute
{

    @Override
    public void parade()
    {
        Output.output(
                this.getClass().toString(),
                "parade",
                String.valueOf(System.identityHashCode(this)),
                "巡游路线一:\t旋转木马 ---> 星光大道 ---> 过山车 ---> 灵感街 ---> 纪念品商店 "
        );
//        System.out.format("巡游路线一:\n\t旋转木马 ---> 星光大道 ---> 过山车 ---> 灵感街 ---> 纪念品商店 \n ");
    }
}
