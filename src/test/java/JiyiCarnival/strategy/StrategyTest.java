package JiyiCarnival.strategy;

import JiyiCarnival.entertainment.parade.strategy.Parade;
import JiyiCarnival.entertainment.parade.strategy.ParadeRoute;
import JiyiCarnival.entertainment.parade.strategy.RouteOne;
import JiyiCarnival.entertainment.parade.strategy.RouteTwo;
import org.junit.Test;

public class StrategyTest {
    @Test
    public void TestStrategy(){
        System.out.println("策略模式测试：");

        Parade parade=new Parade();
        ParadeRoute route1=new RouteOne();
        parade.setRoute(route1);
        parade.parade();

        ParadeRoute route2=new RouteTwo();
        parade.setRoute(route2);
        parade.parade();

//        System.out.println("Exit StrategyTest\n");
    }


}
