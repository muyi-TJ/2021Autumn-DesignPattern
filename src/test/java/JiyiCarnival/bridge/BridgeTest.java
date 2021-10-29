package JiyiCarnival.bridge;

import JiyiCarnival.entertainment.firework.bridge.*;

import junit.framework.TestCase;
import org.junit.Test;


public class BridgeTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("桥接模式测试：");
        FlowerFirework flowerFirework = new FlowerFirework(new Blue());
        HeartFirework heartFirework = new HeartFirework(new Red());

        flowerFirework.letOff();
        heartFirework.letOff();
    }

}
