package JiyiCarnival.entertainment.activate.template;

import JiyiCarnival.Output;

/**
 * @author ajt
 * 不同的主题活动的主干，具体活动需要重写play()方法
 */
public abstract class ActivateTemplate
{
    /**
     * 完成主题活动开始前的准备工作，如检查设施
     */
    public void initialize()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "活动开始前检查设施"
        );
    }
    public void initializePrint()
    {
        System.out.println("活动开始前检查设施");
    }

    /**
     * 检票，允许观众进入活动场地
     */
    public void checkIn()
    {
        Output.output(
                this.getClass().toString(),
                "checkIn",
                String.valueOf(System.identityHashCode(this)),
                "检票并允许持票观众入场"
        );
    }
    public void checkInPrint()
    {
        System.out.println("\n检票并允许持票观众入场");
    }
    /**
     * 开始进行主题活动
     */
    public void startActivate()
    {
        Output.output(
                this.getClass().toString(),
                "startActivate",
                String.valueOf(System.identityHashCode(this)),
                "开始活动"
        );
    }
    public void startActivatePrint()
    {
        System.out.println("\n开始活动");
    }

    /**
     * 进行主题活动
     */
    public abstract void play();
    public abstract void playPrint();
    /**
     * 主题活动结束
     */
    public void endActivate()
    {
        Output.output(
                this.getClass().toString(),
                "endActivate",
                String.valueOf(System.identityHashCode(this)),
                "活动结束"
        );
    }
    public void endActivatePrint()
    {
        System.out.println("\n活动结束");
    }
    /**
     * 观众散场，进行散场后的清理和检查
     */
    public void cleanUp()
    {
        Output.output(
                this.getClass().toString(),
                "cleanUp",
                String.valueOf(System.identityHashCode(this)),
                "观众结束后清理场地"
        );
    }
    public void cleanUpPrint()
    {
        System.out.println("观众结束后清理场地");
    }
    /**
     * 按阶段进行主题活动
     */
    public final void playActivate()
    {
        initialize();
        checkIn();
        startActivate();
        play();
        endActivate();
        cleanUp();
    }
    public final void playActivatePrint() throws InterruptedException {
        initializePrint();
        for(int i = 0; i < 5; i++){
            System.out.print('.');
            Thread.sleep(200);
        }

        checkInPrint();
        for(int i = 0; i < 5; i++){
            System.out.print('.');
            Thread.sleep(200);
        }

        startActivatePrint();
        for(int i = 0; i < 5; i++){
            System.out.print('.');
            Thread.sleep(200);
        }

        playPrint();
        for(int i = 0; i < 10; i++){
            System.out.print('.');
            Thread.sleep(200);
        }

        endActivatePrint();
        cleanUpPrint();
        for(int i = 0; i < 5; i++){
            System.out.print('.');
            Thread.sleep(200);
        }
        System.out.println("\n");

    }
}
