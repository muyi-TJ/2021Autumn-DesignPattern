package JiyiCarnival.entertainment.stage.abstractfactory.Lightings;

import JiyiCarnival.entertainment.stage.abstractfactory.Lighting;

/**
 * @author muyi
 * 激光灯类
 */
public class Laser implements Lighting
{
    @Override
    public void turnOn()
    {
        System.out.println("打开激光灯");
    }

}
