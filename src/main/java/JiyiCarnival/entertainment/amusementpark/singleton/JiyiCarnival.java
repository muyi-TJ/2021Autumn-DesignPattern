package JiyiCarnival.entertainment.amusementpark.singleton;

import JiyiCarnival.Output;
import JiyiCarnival.Processor.MainProcessor;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.base.website.frontcontroller.WebsiteUI;
import JiyiCarnival.entertainment.shooting.memento.RecordCaretaker;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.time.Clock;
import JiyiCarnival.util.visitor.Visitor;
import JiyiCarnival.util.visitor.VisitorCreator;

import java.text.ParseException;

/**
 * @author muyi
 * 济忆嘉年华本身
 */
public class JiyiCarnival
{
    private static JiyiCarnival instance = new JiyiCarnival();
    private WebsiteUI websiteUI = new WebsiteUI();
    private static Visitor visitor;
    private static Ticket ticket;
    private static String weather = "晴天";
    private static int temperature = (int) Math.round(Math.random() * 10 + 30);
    private static Clock clock;
    private static RecordCaretaker recordCaretaker = new RecordCaretaker();

    static {
        try {
            clock = Clock.getInstance();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * 提供私有的构造函数，使其不会被实例化
     */
    private JiyiCarnival()
    {

    }

    /**
     * @return 单例实体
     */
    public static JiyiCarnival getInstance()
    {
        return instance;
    }

    /**
     * 显示信息函数
     */
    public void getInfo()
    {
        Output.output(this.getClass().toString(),
                "getInfo",
                String.valueOf(System.identityHashCode(this)),
                "当前的游乐园是：" + this.toString()
        );
    }

    /**
     * 设置游乐园游客
     * @param visitor 游客
     */
    public void setVisitor(Visitor visitor){
        this.visitor = visitor;
    }

    /**
     * 设置游乐园游客
     * @param ticket 设置游乐园门票
     */
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    /**
     * 获得游客
     * @return 游客
     */
    public static Visitor getVisitor(){return visitor;}

    /**
     * 获得门票
     * @return 游客所购买的门票
     */
    public static Ticket getTicket(){return ticket;}

    /**
     * 设置时间
     * @throws ParseException
     */
    public void setClock() throws ParseException {
        clock = Clock.getInstance();
    }

    /**
     * 获取记录
     * @return 记录
     */
    public static RecordCaretaker getRecordCaretaker(){
        return recordCaretaker;
    }


    /**
     * 游乐园流程控制器
     */
    public void flowControl() throws InterruptedException {
        int web_choice = websiteUI.website();
        if(web_choice == 5)
            return;
        VisitorCreator visitorCreator = new VisitorCreator();
        visitor = visitorCreator.create();
        ticket = visitorCreator.getTicket();
        int choice = 0;
        while(0 == choice) {
            System.out.println("请选择游玩路线：\n[1] 自由行路线\n[2] 青春挑战路线\n[3] 浪漫情侣路线\n[4] 童真欢乐路线");
            choice = Input.input();
            switch (choice){
                case 1:
                    MainProcessor mainProcessor = new MainProcessor();
                    mainProcessor.flowControl();
                    break;
                case 2:
                    choice = 0;
                    break;
                case 3:
                    choice = 0;
                    break;
                default:
                    choice = 0;
                    break;
            }
        }
    }


    /**
     * 获得今日温度
     * @return 返回温度
     */
    public static int getTemperature() {
        return temperature;
    }

    /**
     * 获得今日天气
     * @return 天气
     */
    public static String getWeather() {
        return weather;
    }
}
