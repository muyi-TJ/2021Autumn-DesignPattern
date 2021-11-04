package JiyiCarnival.entertainment.firework.bridge;

/**
 * @author muyi
 * 爱心烟花类
 */

public class HeartFirework extends Firework
{
    private String shape = "爱心";

    public HeartFirework(LetOffAPI letOffAPI)
    {
        super(letOffAPI);
    }

    @Override
    public void letOff()
    {
        super.color.letOffFirework(shape);
    }

    @Override
    public void letOffPrint() throws InterruptedException {super.color.letOff(shape);}

}
