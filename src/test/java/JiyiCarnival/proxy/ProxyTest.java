package JiyiCarnival.proxy;

import JiyiCarnival.base.powerbank.proxy.Stuff;
//import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class ProxyTest extends TestCase
{

    @Test
    public void test()
    {
        System.out.println("代理模式测试：");
        Stuff stuff = new Stuff(0);
        stuff.getPowerBank(1);
        stuff.getPowerBank(2);
        stuff.getPowerBank(3);
    }
}
