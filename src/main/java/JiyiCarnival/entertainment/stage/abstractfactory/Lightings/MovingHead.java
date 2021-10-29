package JiyiCarnival.entertainment.stage.abstractfactory.Lightings;

import JiyiCarnival.entertainment.stage.abstractfactory.Lighting;

/**
 * @author muyi
 * 摇头灯类
 */
public class MovingHead implements Lighting
{
    @Override
    public void turnOn()
    {
        System.out.println("打开摇头灯");
    }
}
