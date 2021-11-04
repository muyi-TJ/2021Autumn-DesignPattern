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

    @Override
    public void turnOnPrint() throws InterruptedException {
        System.out.println("呼呼！");
        Thread.sleep(500);
        System.out.println("让我们打开激光灯！");
    }

}
