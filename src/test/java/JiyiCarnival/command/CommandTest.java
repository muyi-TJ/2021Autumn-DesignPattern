package JiyiCarnival.command;

import JiyiCarnival.business.orderfood.command.*;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Zong
 */
public class CommandTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("命令模式测试：");

        Cook cook = new Cook("KFC");

        FoodOrder buyFoodOrder = new FoodOrder(cook, "汉堡包");
        DrinkOrder buyDrinkOrder = new DrinkOrder(cook, "可乐");
        DessertOrder buyDessertOrder = new DessertOrder(cook, "蛋挞");

        Waiter waiter = new Waiter();
        waiter.setList(buyFoodOrder);
        waiter.setList(buyDrinkOrder);
        waiter.setList(buyDessertOrder);
        waiter.Notify();
    }

}
