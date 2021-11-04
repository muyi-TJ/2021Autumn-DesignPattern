package JiyiCarnival.service.securitycheck.facade;

import JiyiCarnival.Output;
import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;

/**
 * @author Caviar011230
 * 人身安检
 */

public class PersonalSecurityCheck
{
    /**
     * 人身安检
     */
    public void personalSecurityCheck()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "对游客进行了人身安检"
        );
    }

    public void personalSecurityCheckPrint() throws InterruptedException {
        String name = JiyiCarnival.getVisitor().getName();
        System.out.println("尊敬的" + name + "，请将站在楼台上");
        Thread.sleep(1000);
        System.out.println("正在对您进行安检，请稍后。");
        for(int i=0; i<4; i++){
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println("\n非常感谢您对我们工作的支持，祝您游玩愉快！");
    }


}
