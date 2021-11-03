package JiyiCarnival.service.securitycheck.facade;

import JiyiCarnival.Output;
import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;

/**
 * @author Caviar011230
 * 证件检查
 */
public class CertificateCheck
{
    /**
     * 证件检查
     */
    public void checkCertificate()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "检查了顾客的相应证件"
        );
    }

    public void checkCertificatePrint() throws InterruptedException {
        String name = JiyiCarnival.getVisitor().getName();
        System.out.println("尊敬的" + name + "，请出示您的证件");
        Thread.sleep(1000);
        System.out.println("正在查验您的证件，请稍后。");
        for(int i=0; i<4; i++){
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println("\n非常感谢您对我们工作的支持，祝您游玩愉快！");
    }
}
