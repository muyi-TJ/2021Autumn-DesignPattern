package JiyiCarnival.entertainment.firework.bridge;

/**
 * @author muyi
 * 蓝色烟花
 */

public class Blue implements LetOffAPI
{
    @Override
    public void letOffFirework(String shape)
    {
        System.out.println("放飞了" + shape + "样的蓝色烟花");
    }

}
