package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

import JiyiCarnival.Output;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WKATZZL
 * 处理抽象类
 */
public class Play extends SlideHandler
{
    private Visitor visitor;
    /**
     * @param step 游玩水上滑梯所对应的步骤
     */
    public Play(int step)
    {
        super(play);
    }


    /**
     * 构造函数
     * @param step 买票所对应的步骤
     * @param visitor 设置游客
     */
    public Play(int step, Visitor visitor){
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
                "游客游玩水上滑梯"
        );
    }

    @Override
    protected void handlePrint() throws InterruptedException {
        System.out.print(visitor.getName() + "您已经滑行了25%了！");
        for(int i = 0; i < 10; i++){
            System.out.print('.');
            Thread.sleep(200);
        }
        System.out.print("\n" + visitor.getName() + "您已经滑行了50%了！");
        for(int i = 0; i < 10; i++){
            System.out.print('.');
            Thread.sleep(200);
        }
        System.out.print("\n" + visitor.getName() + "您已经滑行了75%了！");
        for(int i = 0; i < 10; i++){
            System.out.print('.');
            Thread.sleep(200);
        }
        System.out.println("\n" + visitor.getName() + "您已经到达终点了！");
        Thread.sleep(1000);
    }
}
