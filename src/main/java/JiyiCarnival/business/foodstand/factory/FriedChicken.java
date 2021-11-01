package JiyiCarnival.business.foodstand.factory;

import JiyiCarnival.Output;

/**
 * @author Caviar011230
 * 炸鸡类
 */
public class FriedChicken implements Snack
{
    /**
     * 获取炸鸡
     */
    @Override
    public void get()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "制作出了一份炸鸡"
        );
    }
}
