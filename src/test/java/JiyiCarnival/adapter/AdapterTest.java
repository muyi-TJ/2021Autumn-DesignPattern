package JiyiCarnival.adapter;


import JiyiCarnival.entertainment.hotairballoon.adapter.*;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void test()
    {
        System.out.println("适配器模式测试：");
        Bird bird = new Bird();
        bird.fly();
        HotAirBalloonAdapter tourist = new HotAirBalloonAdapter();
        tourist.fly();
    }
}
