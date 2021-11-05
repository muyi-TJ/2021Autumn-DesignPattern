package JiyiCarnival.factory;

import JiyiCarnival.business.foodstand.factory.*;
//import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

/**
 * @author Caviar011230
 */
public class FactoryTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("工厂方法模式测试：");
        SnackFactory snackFactory = new SnackFactory();

        Snack candiedFruit = snackFactory.produce("CandiedFruit");
        Snack coke = snackFactory.produce("Coke");
        Snack friedChicken = snackFactory.produce("FriedChicken");

        candiedFruit.get();
        coke.get();
        friedChicken.get();

    }
}
