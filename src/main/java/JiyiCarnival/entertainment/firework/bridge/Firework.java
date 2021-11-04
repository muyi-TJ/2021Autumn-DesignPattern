package JiyiCarnival.entertainment.firework.bridge;

/**
 * @author muyi
 * 烟花类
 */
public abstract class Firework
{
    protected LetOffAPI color;

    /**
     * 烟花构造器
     *
     * @param color 烟花颜色
     */
    protected Firework(LetOffAPI color)
    {
        this.color = color;
    }

    /**
     * 放烟花函数 测试模式
     */
    public abstract void letOff();

    public abstract void letOffPrint();


}
