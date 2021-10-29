package JiyiCarnival.entertainment.stage.abstractfactory.Lightings;

import JiyiCarnival.entertainment.stage.abstractfactory.Lighting;

/**
 * @author muyi
 * 追光灯类
 */
public class TracingLamp implements Lighting
{
    @Override
    public void turnOn()
    {
        System.out.println("打开追光灯");
    }

}
