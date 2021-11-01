package JiyiCarnival.factory;

import JiyiCarnival.business.foodstand.factory.CandiedFruitFactory;
import JiyiCarnival.business.foodstand.factory.CokeFactory;
import JiyiCarnival.business.foodstand.factory.FriedChickenFactory;
import JiyiCarnival.business.foodstand.factory.SnackFactory;
import org.junit.Test;

/**
 * @author Caviar011230
 */
public class FactoryTest
{
    @Test
    public void test()
    {
        System.out.println("工厂方法模式测试：");
        SnackFactory candiedFruitFactory = new CandiedFruitFactory();
        SnackFactory cokeFactory = new CokeFactory();
        SnackFactory friedChickenFactory = new FriedChickenFactory();

        candiedFruitFactory.produce().get();
        cokeFactory.produce().get();
        friedChickenFactory.produce().get();
    }
}
