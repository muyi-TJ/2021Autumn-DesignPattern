package JiyiCarnival.entertainment.parade.strategy;

import JiyiCarnival.Output;

/**
 * @author Rounds-Chen
 *
 * 巡游路线二
 */
public class RouteTwo implements ParadeRoute{
    @Override
    public void parade() {
        Output.output(
                this.getClass().toString(),
                "parade",
                String.valueOf(System.identityHashCode(this)),
                "巡游路线二:\t 水上滑梯 ---> 阳光大道 ---> 热气球 ---> 九龙花街 ---> 异度空间"
        );
//        System.out.format("巡游路线二:\n\t 水上滑梯 ---> 阳光大道 ---> 热气球 ---> 九龙花街 ---> 异度空间\n\n");
    }
}
