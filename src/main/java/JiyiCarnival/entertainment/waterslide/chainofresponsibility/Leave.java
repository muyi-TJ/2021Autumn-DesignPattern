package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

import JiyiCarnival.Output;

/**
 * @author WKATZZL
 * 处理抽象类
 */
public class Leave extends SlideHandler
{
    /**
     * @param step 离开水上滑梯所对应的步骤
     */
    public Leave(int step)
    {
        super(leave);
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
    protected void handlePrint()
    {
        Output.output(this.getClass().toString(),
                "handle",
                String.valueOf(System.identityHashCode(this)),
                "游客离开水上滑梯"
        );
    }
}
