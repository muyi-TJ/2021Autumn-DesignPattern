package JiyiCarnival.entertainment.hotairballoon.adapter;

import JiyiCarnival.Output;

/**
 * @author WKATZZL
 * 热气球适配器
 */
public class HotAirBalloonAdapter implements Flyable{
    // 乘坐热气球飞行的游客
    private Visitor visitor = new Visitor();

    /**
     * 默认构造函数 对游客姓名设置默认值
     */
    public HotAirBalloonAdapter(){
        visitor.setName("游客");
    }

    /**
     * 构造函数重载 可设置游客姓名
     * @param name 游客姓名
     */
    public HotAirBalloonAdapter(String name){
        visitor.setName(name);
    }

    /**
     * 设置游客姓名
     * @param visitor 游客姓名
     */
    public void setVisitor(Visitor visitor){
        this.visitor = visitor;
    }

    /**
     * 查询游客姓名
     * @return 返回游客姓名
     */
    public Visitor getVisitor(){
        return visitor;
    }

    /**
     * 游客乘坐热气球飞行
     */
    @Override
    public void fly(){
        Output.output(this.getClass().toString(),
                "fly",
                String.valueOf(System.identityHashCode(this)),
                visitor.getName() + "乘坐热气球在空中飞行"
        );

        visitor.walk();
    }

}
