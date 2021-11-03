package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

import JiyiCarnival.Output;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WKATZZL
 * 处理抽象类
 */
public class Leave extends SlideHandler
{
    private Visitor visitor;
    /**
     * @param step 离开水上滑梯所对应的步骤
     */
    public Leave(int step)
    {
        super(leave);
    }


    /**
     * 构造函数
     * @param step 买票所对应的步骤
     * @param visitor 设置游客
     */
    public Leave(int step, Visitor visitor){
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
                "游客离开水上滑梯"
        );
    }

    @Override
    protected void handlePrint() throws InterruptedException {
        System.out.println("欢迎下次再来！再见！");
        Thread.sleep(1000);
    }
}
