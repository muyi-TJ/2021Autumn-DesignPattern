package JiyiCarnival.proxy;

import JiyiCarnival.base.powerbank.proxy.Stuff;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void test(){
        System.out.println("代理模式测试：");
        Stuff stuff = new Stuff();
        stuff.getPowerBank(1);
        stuff.getPowerBank(2);
        stuff.getPowerBank(3);
    }
}
