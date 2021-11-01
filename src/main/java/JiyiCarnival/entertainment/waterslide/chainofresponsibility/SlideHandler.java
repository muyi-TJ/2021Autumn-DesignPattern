package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

/**
 * @author WKATZZL
 * 处理抽象类
 */

public abstract class SlideHandler
{
    /**
     * 各个步骤
     */
    public static int ticket = 1;
    public static int enter = 2;
    public static int play = 3;
    public static int leave = 4;

    /**
     * 游玩水上滑梯所处步骤
     * 也可以说是责任链中所处步骤
     */
    private int step;
    /**
     * 游玩的下一步
     * 也可以说是责任链的下一步
     */
    private SlideHandler nextStep = null;

    /**
     * @param step 当前所处步骤
     */
    public SlideHandler(int step)
    {
        this.step = step;
    }

    /**
     * @param nextStep 设置下一个步骤
     */
    public void setNextStep(SlideHandler nextStep)
    {
        this.nextStep = nextStep;
    }

    /**
     * @return 当前所处步骤
     */
    public int getCurrentStep()
    {
        return this.step;
    }

    /**
     * 事件处理
     */
    protected abstract void handle();

    /**
     * @param request 游客所发起的请求
     */
    public void handleRequest(Request request)
    {
        if (this.step <= request.getStep())
        {
            this.handle();
        }
        if (this.nextStep != null)
        {
            this.nextStep.handleRequest(request);
        }
    }
}
