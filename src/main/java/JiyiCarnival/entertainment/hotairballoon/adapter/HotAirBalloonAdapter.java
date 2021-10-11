package JiyiCarnival.entertainment.hotairballoon.adapter;

/**
 * @author WKATZZL
 *
 * 热气球适配器
 */
public class HotAirBalloonAdapter implements Flyable{
    // 乘坐热气球飞行的游客姓名
    private String name;

    /**
     * 默认构造函数 对游客姓名设置默认值
     */
    public HotAirBalloonAdapter(){
        name = "游客";
    }

    /**
     * 构造函数重载 可设置游客姓名
     * @param name 游客姓名
     */
    public HotAirBalloonAdapter(String name){
        this.name = name;
    }

    /**
     * 设置游客姓名
     * @param name 游客姓名
     */
    public void setTouristName(String name){
        this.name = name;
    }

    /**
     * 查询游客姓名
     * @return 返回游客姓名
     */
    public String getTouristName(){
        return name;
    }

    /**
     * 游客乘坐热气球飞行
     */
    @Override
    public void fly(){
        System.out.println(name + "乘坐热气球在空中飞行");
    }

}
