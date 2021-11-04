package JiyiCarnival.entertainment.stage.abstractfactory;

/**
 * @author muyi
 * 物品接口
 */
public interface Item
{
    /**
     * 使用物品 测试模式
     */
    public void useItem();


    /**
     * 使用物品 游乐园模式
     */
    public void useItemPrint() throws InterruptedException;
}
