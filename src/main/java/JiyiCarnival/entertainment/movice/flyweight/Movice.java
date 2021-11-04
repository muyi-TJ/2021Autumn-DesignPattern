package JiyiCarnival.entertainment.movice.flyweight;

import JiyiCarnival.Output;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author ajt
 * 具体的电影类
 */
public class Movice extends AbstractMovice
{

    /**
     * 电影构造器
     *
     * @param name 电影名称
     */
    public Movice(String name)
    {
        super(name);
    }
    public Movice(String[] names){super(names);}

    /**
     * 设置改电影的放映厅号
     *
     * @param room 放映厅号
     */
    @Override
    public void play(String room)
    {
        Output.output(
                this.getClass().toString(),
                "play",
                String.valueOf(System.identityHashCode(this)),
                room + "号放映厅正在播放" + this.name
        );
    }

    /**
     * 设置游客并播放电影
     * @param visitor 游客
     * @throws InterruptedException 使用了线程睡眠函数
     */

    @Override
    public void play(Visitor visitor) throws InterruptedException {
        if(0 == names.length)
            System.out.println("今日的电影是：" + name);
        else {
            int movieIndex =  (int) Math.floor(Math.random() * names.length);
            String movieName = names[movieIndex];
            System.out.println("今日的电影是" + movieName);
        }
        System.out.println("尊敬的" + visitor.getName() + "请稍等，正在出票");
        for(int i = 0; i < 6; i++){
            System.out.print('.');
            Thread.sleep(500);
        }
        System.out.println("\n出票成功！请收好您的电影票！");
        String room = (int) Math.floor(Math.random() * 7) + "号放映厅";
        String seat = (int) Math.floor(Math.random() * 30 + 1) + "排" + (int) Math.floor(Math.random() * 40 + 1) + "列";
        String TicketInfo = """
                                
                ------------------------
                电影票：
                游客姓名：%s
                放映厅：%s
                座位号：%s
                ------------------------
                """;
        TicketInfo = String.format(TicketInfo, visitor.getName(), room, seat);
        System.out.println(TicketInfo);
        // TODO 使用字符串动画
        // 电影还有三秒开始 倒计时三秒
        // 电影放映
        // 电影结束
        System.out.println("祝您观影愉快！再见!");

    }
}
