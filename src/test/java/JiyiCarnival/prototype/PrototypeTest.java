package JiyiCarnival.prototype;

import JiyiCarnival.base.restroom.prototype.*;

import junit.framework.TestCase;
import org.junit.Test;


public class PrototypeTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("原型模式测试：");
        var origin=new Restroom("亲子卫生间");
        var manorigin=new ManRestroom();
        var womanorigin=new WomanRestroom();

        var cloneOrigin=origin.clone();
        var cloneManorigin=manorigin.clone();
        var cloneWomanorigin=womanorigin.clone();

        cloneOrigin.getType();
        cloneManorigin.getType();
        cloneWomanorigin.getType();

    }
}
