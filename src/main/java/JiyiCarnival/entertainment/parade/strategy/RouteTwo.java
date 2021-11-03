package JiyiCarnival.entertainment.parade.strategy;

import JiyiCarnival.Output;

/**
 * @author Rounds-Chen
 * <p>
 * 巡游路线二
 */
public class RouteTwo implements ParadeRoute
{
    @Override
    public void parade()
    {
        Output.output(
                this.getClass().toString(),
                "parade",
                String.valueOf(System.identityHashCode(this)),
                "巡游路线二:\t 水上滑梯 ---> 阳光大道 ---> 热气球 ---> 九龙花街 ---> 异度空间"
        );
//        System.out.format("巡游路线二:\n\t 水上滑梯 ---> 阳光大道 ---> 热气球 ---> 九龙花街 ---> 异度空间\n\n");
    }

    @Override
    public void print() throws InterruptedException {
        // TODO 插入字符图画 花车
        String[] destinations = {"水上滑梯", "阳光大道", "热气球", "九龙花街", "异度空间"};
        System.out.println("巡游历程：");
        for(String destination : destinations){
            for(int i = 0; i < 4; i++){
                System.out.print("=");
                Thread.sleep(500);
            }
            System.out.print(">");
            Thread.sleep(500);
            System.out.print(destination);
            Thread.sleep(500);
        }
        System.out.print("\n");
    }


}
