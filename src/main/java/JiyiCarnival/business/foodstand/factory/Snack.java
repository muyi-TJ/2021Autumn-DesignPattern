package JiyiCarnival.business.foodstand.factory;

/**
 * @author Caviar011230
 * 小吃接口
 */
public interface Snack
{
    /**
     * 获取小吃 测试模式
     */
    void get();

    /**
     * 获取小吃 游乐园模式
     */
    void getPrint() throws InterruptedException;
}
