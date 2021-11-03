package JiyiCarnival.business.orderfood.command;

/**
 * @author Zong
 * 食物订单
 */

public class FoodOrder implements Order
{
    private Cook cook;
    private String name;

    public FoodOrder(Cook cook, String name)
    {
        this.cook = cook;
        this.name = name;
    }

    /**
     * 执行菜品订单
     */
    @Override
    public void execute()
    {
        cook.CookFood(name);
    }
    @Override
    public void visitorExecute()
    {
        cook.visitorCookFood(name);
    }
}
