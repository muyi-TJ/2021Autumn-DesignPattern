package JiyiCarnival.flyweight;

import JiyiCarnival.entertainment.movice.flyweight.Movice;
import JiyiCarnival.entertainment.movice.flyweight.MoviceFactory;
import org.junit.Test;

public class FlyweightTest
{

    @Test
    public void test()
    {
        System.out.println("享元模式测试：");

        Movice movice1 = MoviceFactory.getMovice("Mine");
        movice1.play("1");
        Movice movice2 = MoviceFactory.getMovice("Red");
        movice2.play("2");
        Movice movice3 = MoviceFactory.getMovice("Mine");
        movice3.play("3");
        Movice movice4 = MoviceFactory.getMovice("Mine");
        movice4.play("4");
        Movice movice5 = MoviceFactory.getMovice("White");
        movice5.play("5");
        Movice movice6 = MoviceFactory.getMovice("Red");
        movice6.play("6");
    }
}
