package JiyiCarnival.entertainment.firework.bridge;

/**
 * @author muyi
 *
 * 花朵烟花类
 */
public class FlowerFirework extends Firework
{
    private String shape="花朵";

    public FlowerFirework(LetOffAPI letOffAPI)
    {
        super(letOffAPI);
    }

    @Override
    public void letOff()
    {
        super.color.letOffFirework(shape);
    }
}
