package JiyiCarnival.entertainment.stage.abstractfactory;

import JiyiCarnival.entertainment.stage.abstractfactory.Lightings.Laser;
import JiyiCarnival.entertainment.stage.abstractfactory.Lightings.MovingHead;
import JiyiCarnival.entertainment.stage.abstractfactory.Lightings.TracingLamp;

/**
 * @author muyi
 * 灯光工厂类
 */
public class LightingFactory extends AbstractFactory
{
    @Override
    public Lighting getLighting(String lighting)
    {
        if (lighting == null)
        {
            return null;
        }
        if (lighting == "MovingHead")
        {
            return new MovingHead();
        }
        else if (lighting == "Laser")
        {
            return new Laser();
        }
        else if (lighting == "TracingLamp")
        {
            return new TracingLamp();
        }
        return null;
    }

    @Override
    public Item getItem(String item)
    {
        return null;
    }
}
