package JiyiCarnival.singleton;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import junit.framework.TestCase;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class SingletonTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("单例模式测试：");
        JiyiCarnival carnival1 = JiyiCarnival.getInstance();
        JiyiCarnival carnival2 = JiyiCarnival.getInstance();

        assertSame(carnival1, carnival2);

        carnival1.getInfo();
        carnival2.getInfo();
    }

}
