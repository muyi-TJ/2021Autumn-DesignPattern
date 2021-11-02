package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 创建购票视图类
 */
public class BuyTicketView
{
    /**
     * 展示购票视图
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

    public String view(){
        String text = "在这里购买门票，即可凭票入园！";
        return text;
    }
}