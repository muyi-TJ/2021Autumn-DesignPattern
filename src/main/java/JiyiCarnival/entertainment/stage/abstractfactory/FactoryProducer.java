package JiyiCarnival.entertainment.stage.abstractfactory;

/**
 * @author muyi
 * 工厂提供类
 */
public class FactoryProducer
{
    /**
     * 获取工厂函数
     * @param factory 工厂类型
     * @return 对应工厂
     */
    public static AbstractFactory getFactory(String factory)
    {
        if(factory=="Lighting")
        {
            return new LightingFactory();
        }
        else if(factory=="Item")
        {
            return new ItemFactory();
        }
        return null;
    }
}
