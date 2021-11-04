package JiyiCarnival.business.orderfood.command;

import JiyiCarnival.Output;

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
     *
     * @param name 菜品名称
     */
    public void CookFood(String name)
    {
        String text = cookName + "制作菜品" + name;
        Output.output(
                this.getClass().toString(),
                "CookFood",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 接收订单
     *
     * @param name 饮品名称
     */
    public void CookDrink(String name)
    {
        String text = cookName + "制作饮品" + name;
        Output.output(
                this.getClass().toString(),
                "CookDrink",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 接收订单
     *
     * @param name 甜点名称
     */
    public void CookDessert(String name)
    {
        String text = cookName + "制作甜点" + name;
        Output.output(
                this.getClass().toString(),
                "CookDessert",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 以下是游玩模式的输出
     * @param name
     */
    public void visitorCookFood(String name)
    {
        System.out.println(cookName + "制作菜品" + name);
    }

    public void visitorCookDrink(String name)
    {
        System.out.println(cookName + "制作饮品" + name);

    }

    public void visitorCookDessert(String name)
    {
        System.out.println(cookName + "制作甜点" + name);
    }
}
