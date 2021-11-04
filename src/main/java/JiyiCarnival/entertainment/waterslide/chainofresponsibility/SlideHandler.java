package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WKATZZL
 * 处理抽象类
 */

public abstract class SlideHandler
{
    private Visitor visitor;
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
    protected abstract void handleLog();
    protected abstract void handlePrint() throws InterruptedException;

    /**
     * @param request 游客所发起的请求
     */
    public void handleRequest(Request request)
    {
        if (this.step <= request.getStep())
        {
            this.handleLog();
        }
        if (this.nextStep != null)
        {
            this.nextStep.handleRequest(request);
        }
    }

    public void handleVisitorRequest(Request request) throws InterruptedException {
        if (this.step <= request.getStep())
        {
            this.handlePrint();
        }
        if (this.nextStep != null)
        {
            this.nextStep.handleVisitorRequest(request);
        }
    }

    /**
     * 设置游客
     * @param visitor 游客
     */
    public void setVisitor(Visitor visitor){
        this.visitor = visitor;
    }

    /**
     * 获得游客
     * @return 获得游客
     */
    public Visitor getVisitor(){
        return this.visitor;
    }

}
