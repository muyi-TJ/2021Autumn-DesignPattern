package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

import JiyiCarnival.Output;
import JiyiCarnival.util.visitor.Visitor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author WKATZZL
 * 处理抽象类
 */
public class BuyTicket extends SlideHandler
{
    private Visitor visitor;
    /**
     * 构造函数
     * @param step 买票所对应的步骤
     */
    public BuyTicket(int step)
    {
        super(ticket);
    }

    /**
     * 构造函数
     * @param step 买票所对应的步骤
     * @param visitor 设置游客
     */
    public BuyTicket(int step, Visitor visitor){
        super(ticket);
        this.visitor = visitor;
    }

    /**
     * 输出当前需要进行的处理信息
     */
    @Override
    protected void handleLog()
    {
        Output.output(this.getClass().toString(),
                "handle",
                String.valueOf(System.identityHashCode(this)),
                "游客购买滑梯门票"
        );
    }

    @Override
    protected void handlePrint() throws InterruptedException {
        System.out.println("尊敬的" + visitor.getName() + "，您好！欢迎来到水上乐园！请排队稍等片刻。");
        for(int i = 0; i < 15; i++){
            System.out.print('.');
            Thread.sleep(200);
        }
        System.out.println("\n请收好您的滑梯门票，祝您游玩愉快！");
        String ticketInfo = """
                                
                ------------------------
                滑梯门票：
                游客姓名：%s
                开票时间：%s
                ------------------------
                """;
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        ticketInfo = String.format(ticketInfo, visitor.getName(), dateFormat.format(date));
        System.out.println(ticketInfo);
        Thread.sleep(1000);
    }
}
