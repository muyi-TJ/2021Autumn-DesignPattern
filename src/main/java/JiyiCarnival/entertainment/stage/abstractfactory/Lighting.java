package JiyiCarnival.entertainment.stage.abstractfactory;

/**
 * @author muyi
 * 灯光接口
 */
public interface Lighting
{
    /**
     * 打开灯光 测试模式
     */
    public void turnOn();


    /**
     * 打开灯光 游乐园模式
     */
    public void turnOnPrint() throws InterruptedException;
}
