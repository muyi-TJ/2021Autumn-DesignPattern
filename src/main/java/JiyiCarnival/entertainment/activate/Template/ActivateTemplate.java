package JiyiCarnival.entertainment.activate.Template;

/**
 * @author ajt
 * 不同的主题活动的主干，具体活动需要重写play()方法
 */
public abstract class ActivateTemplate {
    /**
     * 完成主题活动开始前的准备工作，如检查设施
     */
    public void initialize(){
        System.out.println("活动开始前检查设施");
    }

    /**
     * 检票，允许观众进入活动场地
     */
    public void checkIn(){
        System.out.println("检票并允许持票观众入场");
    }

    /**
     * 开始进行主题活动
     */
    public void startActivate(){
        System.out.println("开始活动");
    }

    /**
     * 进行主题活动
     */
    public abstract void play();

    /**
     * 主题活动结束
     */
    public void endActivate(){
        System.out.println("活动结束");
    }

    /**
     * 观众散场，进行散场后的清理和检查
     */
    public void cleanUp(){
        System.out.println("观众结束后清理场地");
    }

    /**
     * 按阶段进行主题活动
     */
    public final void playActivate(){
        initialize();
        checkIn();
        startActivate();
        play();
        endActivate();
        cleanUp();
    }
}
