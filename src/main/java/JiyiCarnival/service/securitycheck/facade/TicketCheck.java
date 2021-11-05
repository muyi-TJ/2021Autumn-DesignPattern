package JiyiCarnival.service.securitycheck.facade;

import JiyiCarnival.Output;
import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;

/**
 * @author Caviar011230
 * 检票
 */
public class TicketCheck
{
    /**
     * 检票
     */
    public void ticketCheck()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "对游客进行了检票"
        );
    }

    public void ticketCheckPrint() throws InterruptedException {
        String name = JiyiCarnival.getVisitor().getName();
        System.out.println("尊敬的" + name + "，请将站在楼台上");
        Thread.sleep(1000);
        System.out.println("正在查验您的门票，请稍后。");
        for(int i=0; i<4; i++){
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println("\n非常感谢您对我们工作的支持，祝您游玩愉快！");
    }


}
