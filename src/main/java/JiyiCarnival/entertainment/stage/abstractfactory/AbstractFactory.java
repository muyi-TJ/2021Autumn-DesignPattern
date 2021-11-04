package JiyiCarnival.entertainment.stage.abstractfactory;

/**
 * @author muyi
 * 抽象工厂类
 */
public abstract class AbstractFactory
{
    /**
     * 获取灯光
     *
     * @param lighting 灯光类型
     * @return 灯光对象
     */
    public abstract Lighting getLighting(String lighting);

    /**
     * 获取物品
     *
     * @param item 物品种类
     * @return 物品对象
     */
    public abstract Item getItem(String item);


}
