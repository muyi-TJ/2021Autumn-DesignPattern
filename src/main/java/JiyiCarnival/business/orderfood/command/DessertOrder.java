package JiyiCarnival.business.orderfood.command;

/**
 * @author Zong
 * 甜点订单
 */

public class DessertOrder implements Order
{
    private Cook cook;
    private String name;

    public DessertOrder(Cook cook, String name)
    {
        this.cook = cook;
        this.name = name;
    }

    /**
     * 执行甜品订单
     */
    @Override
    public void execute()
    {
        cook.CookDessert(name);
    }
}
