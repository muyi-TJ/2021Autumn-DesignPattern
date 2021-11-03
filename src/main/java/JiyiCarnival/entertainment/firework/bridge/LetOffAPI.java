package JiyiCarnival.entertainment.firework.bridge;

/**
 * @author muyi
 * 放烟花接口
 */
public interface LetOffAPI
{
    /**
     * @param shape 烟花形状 测试模式
     */
    public void letOffFirework(String shape);

    /**
     * @param shape 烟花形状 游乐园模式
     */
    public void letOff(String shape);
}
