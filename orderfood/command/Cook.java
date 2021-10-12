package JiyiCarnival.business.orderfood.command;

/**
 * @author Zong
 * 厨师
 */

public class Cook
{
    private String cookName;
    public Cook(String cookname)
    {
        this.cookName = cookname;
    }

    /**
     * 接收订单
     * @param name 菜品名称
     */
    public void CookFood (String name)
    {
        System.out.println(cookName + "制作菜品" + name);
    }

    /**
     * 接收订单
     * @param name 饮品名称
     */
    public void CookDrink (String name)
    {
        System.out.println(cookName + "制作饮品" + name);
    }

    /**
     * 接收订单
     * @param name 甜点名称
     */
    public void CookDessert (String name)
    {
        System.out.println(cookName + "制作甜点" + name);
    }
}
