package JiyiCarnival.entertainment.movie.flyweight;

import JiyiCarnival.Output;
import JiyiCarnival.util.strvideo.StrVideo;
import JiyiCarnival.util.visitor.Visitor;

import java.io.IOException;

/**
 * @author ajt
 * 具体的电影类
 */
public class Movie extends AbstractMovie
{

    /**
     * 电影构造器
     *
     * @param name 电影名称
     */
    public Movie(String name)
    {
        super(name);
    }
    public Movie(String[] names){super(names);}

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
    public void play(Visitor visitor) throws InterruptedException, IOException {
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
        System.out.println("电影还有三秒开始。");
        for(int i=0; i<3; i++) {
            System.out.print('.');
            Thread.sleep(1000);
        }
        System.out.println();
        StrVideo strVideo = new StrVideo("src\\main\\java\\JiyiCarnival\\imgs\\movie");
        strVideo.play(255, 0, 0, true);
        strVideo.close();
        System.out.println("祝您观影愉快！再见!");

    }
}
