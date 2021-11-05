package JiyiCarnival.prototype;

import JiyiCarnival.base.restroom.prototype.ManRestroom;
import JiyiCarnival.base.restroom.prototype.Restroom;
import JiyiCarnival.base.restroom.prototype.WomanRestroom;
import junit.framework.TestCase;
//import org.junit.Test;
import org.junit.jupiter.api.Test;


public class PrototypeTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("原型模式测试：");
        var normalOrigin=new Restroom();
        var barrierFreeOrigin = new Restroom("无障碍卫生间");
        var manOrigin = new ManRestroom();
        var womanOrigin = new WomanRestroom();

        var cloneNormalOrigin=normalOrigin.clone();
        var cloneBarrierFreeOrigin = barrierFreeOrigin.clone();
        var cloneManOrigin = manOrigin.clone();
        var cloneWomanOrigin = womanOrigin.clone();

        cloneNormalOrigin.getTypeLog();
        cloneBarrierFreeOrigin.getTypeLog();
        cloneManOrigin.getTypeLog();
        cloneWomanOrigin.getTypeLog();

    }
}
