package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;
import JiyiCarnival.base.ticketing.converter.Converter;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.base.ticketing.converter.VisitorConverter;
import JiyiCarnival.util.visitor.Gender;
import JiyiCarnival.util.visitor.Visitor;
import JiyiCarnival.util.input.Input;

import java.util.Scanner;

/**
 * @author Zong
 * 创建购票视图类
 */
public class BuyTicketView
{
    private Visitor visitor = new Visitor();
    private Ticket ticket = null;

    /**
     * 展示购票视图 测试模式
     */
    public void show()
    {
        String text = "在这里购买门票，即可凭票入园！";
        Output.output(
                this.getClass().toString(),
                "show",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 购票视图 游乐园模式
     * @return 购票的游客
     * @throws InterruptedException 使用了线程的睡眠函数
     */
    public void view() throws InterruptedException {
        System.out.println("购买门票，即可凭票入园！");
    }


}