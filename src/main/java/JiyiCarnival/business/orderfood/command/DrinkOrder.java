package JiyiCarnival.business.orderfood.command;

/**
 * @author Zong
 * 饮品订单
 */

public class DrinkOrder implements Order
{

    private Cook cook;
    private String name;

    public DrinkOrder(Cook cook, String name)
    {
        this.cook = cook;
        this.name = name;
    }

    /**
     * 执行饮品订单
     */
    @Override
    public void execute()
    {
        cook.CookDrink(name);
    }
    @Override
    public void visitorExecute()
    {
        cook.visitorCookDrink(name);
    }
}
