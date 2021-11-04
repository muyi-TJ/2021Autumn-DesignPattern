package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

import JiyiCarnival.Output;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WKATZZL
 * 处理抽象类
 */
public class Enter extends SlideHandler
{
    private Visitor visitor;

    /**
     * @param step 进入水上滑梯所对应的步骤
     */
    public Enter(int step)
    {
        super(enter);
    }

    /**
     * 构造函数
     * @param step 买票所对应的步骤
     * @param visitor 设置游客
     */
    public Enter(int step, Visitor visitor){
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
                "游客进入水上滑梯"
        );
    }

    @Override
    protected void handlePrint() throws InterruptedException {
        System.out.println(visitor.getName() + "准备好了吗？" + "水上滑行马上就要开始啦！");
        Thread.sleep(1000);
    }
}
