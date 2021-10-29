package JiyiCarnival.entertainment.stage.abstractfactory.Lightings;

import JiyiCarnival.Output;
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
        Output.output(this.getClass().toString(),
                "turnOn",
                String.valueOf(System.identityHashCode(this)),
                "打开激光灯"
        );
    }

}
