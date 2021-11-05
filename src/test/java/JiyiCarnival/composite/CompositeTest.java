package JiyiCarnival.composite;

import JiyiCarnival.entertainment.carousel.composite.Axis;
import JiyiCarnival.entertainment.carousel.composite.Horse;
//import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CompositeTest extends TestCase
{
    @Test
    public void test() throws InterruptedException {
        System.out.println("组合模式测试：");
        Axis axis = new Axis(0);
        axis.add(new Horse(0));
        axis.add(new Horse(0));
        axis.add(new Horse(0));
        axis.operate();
    }
}
