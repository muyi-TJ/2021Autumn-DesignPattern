package JiyiCarnival.entertainment.firework.bridge;

import JiyiCarnival.Output;

/**
 * @author muyi
 * 蓝色烟花
 */

public class Blue implements LetOffAPI
{
    @Override
    public void letOffFirework(String shape)
    {
        Output.output(this.getClass().toString(),
                "letOffFirework",
                String.valueOf(System.identityHashCode(this)),
                "放飞了" + shape + "样的蓝色烟花"
        );

    }

}
