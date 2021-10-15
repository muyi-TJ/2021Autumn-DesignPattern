package JiyiCarnival.entertainment.firework.bridge;

/**
 * @author muyi
 * 红色烟花
 */

public class Red implements LetOffAPI
{
    @Override
    public void letOffFirework(String shape)
    {
        System.out.println("放飞了" + shape + "样的红色烟花");
    }
}
