package JiyiCarnival.composite;

import JiyiCarnival.entertainment.carousel.composite.Axis;
import JiyiCarnival.entertainment.carousel.composite.Horse;
import org.junit.Test;

public class CompositeTest
{
    @Test
    public void test()
    {
        Axis axis = new Axis(1);
        axis.add(new Horse(1));
        axis.add(new Horse(1));
        axis.add(new Horse(1));
        axis.operate();
    }
}
