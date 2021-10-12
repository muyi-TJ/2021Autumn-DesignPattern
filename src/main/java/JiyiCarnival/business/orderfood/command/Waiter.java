package JiyiCarnival.business.orderfood.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zong
 * 服务员
 */

public class Waiter
{
    private List<Order> list = new ArrayList<>(); //有多个订单

    /**
     * 接收订单
     * @param order 命令
     */
    public void setList(Order order)
    {
        list.add(order);
    }

    /**
     * 通知厨师
     *
     */
    public void Notify()
    {
        for (Order order : list) {
            order.execute();
        }
    }
}
