package JiyiCarnival.service.securitycheck.facade;

import JiyiCarnival.Output;
import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;

/**
 * @author Caviar011230
 * 个人随身物品（背包等）的检查
 */
public class PersonalBelongingCheck
{
    /**
     * 个人随身物品检查
     */
    public void checkPersonalBelongings()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "对游客的背包等个人随身物品进行了检查"
        );
    }


    public void checkPersonalBelongingsPrint() throws InterruptedException {
        String name = JiyiCarnival.getVisitor().getName();
        System.out.println("尊敬的" + name + "，请将您的背包放入安检带上");
        Thread.sleep(1000);
        System.out.println("正在查验您的背包，请稍后。");
        for(int i=0; i<4; i++){
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println("\n非常感谢您对我们工作的支持，祝您游玩愉快！");
    }


}
