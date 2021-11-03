package JiyiCarnival.adapter;


import JiyiCarnival.entertainment.hotairballoon.adapter.Bird;
import JiyiCarnival.entertainment.hotairballoon.adapter.HotAirBalloonAdapter;
import org.junit.Test;

public class AdapterTest
{
    @Test
    public void test()
    {
        System.out.println("适配器模式测试：");
        Bird bird = new Bird();
        bird.flyLog();
        HotAirBalloonAdapter tourist = new HotAirBalloonAdapter();
        tourist.flyLog();
    }
}
