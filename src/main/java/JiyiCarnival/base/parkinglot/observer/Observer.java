package JiyiCarnival.base.parkinglot.observer;

/**
 * @author PinkCrow007
 * 观察者接口类
 */
public interface Observer
{
    /**
     * 观察者的更新方法 测试模式
     *
     * @param flg 标记 1为驶入， 0为驶出
     */
    public void update(boolean flg);

    /**
     * 观察者的更新方法 游乐园模式
     *
     * @param flg 标记 1为驶入， 0为驶出
     */
    public void carUpdate(boolean flg);
}
