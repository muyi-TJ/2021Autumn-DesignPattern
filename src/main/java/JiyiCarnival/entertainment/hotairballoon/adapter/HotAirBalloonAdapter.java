package JiyiCarnival.entertainment.hotairballoon.adapter;

import JiyiCarnival.Output;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WKATZZL
 * 热气球适配器
 */
public class HotAirBalloonAdapter implements Flyable
{
    // 乘坐热气球飞行的游客
    private Visitor visitor = new Visitor();


    /**
     * 默认构造函数 对游客姓名设置默认值
     */
    public HotAirBalloonAdapter()
    {
        visitor.setName("游客");
    }

    /**
     * 构造函数重载 可设置游客姓名
     *
     * @param name 游客姓名
     */
    public HotAirBalloonAdapter(String name)
    {
        visitor.setName(name);
    }

    /**
     * 查询游客姓名
     *
     * @return 返回游客姓名
     */
    public Visitor getVisitor()
    {
        return visitor;
    }

    /**
     * 设置游客姓名
     *
     * @param visitor 游客姓名
     */
    public void setVisitor(Visitor visitor)
    {
        this.visitor = visitor;
    }

    /**
     * 游客乘坐热气球飞行 测试模式
     */
    @Override
    public void flyLog()
    {
        Output.output(this.getClass().toString(),
                "fly",
                String.valueOf(System.identityHashCode(this)),
                visitor.getName() + "乘坐热气球在空中飞行"
        );

        visitor.walkLog();
    }

    /**
     * 游客乘坐热气球飞行 游乐园模式
     */
    @Override
    public void fly(){
        System.out.println(visitor.getName() + "您准备好了吗？");
        System.out.println("济忆号马上就要起航啦！");
        // TODO 插入字符动画
        System.out.println("祝您游玩愉快！再见！");
    }

}
