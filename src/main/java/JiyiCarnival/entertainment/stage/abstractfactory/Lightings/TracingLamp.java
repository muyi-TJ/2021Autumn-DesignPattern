package JiyiCarnival.entertainment.stage.abstractfactory.Lightings;

import JiyiCarnival.Output;
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
        Output.output(this.getClass().toString(),
                "turnOn",
                String.valueOf(System.identityHashCode(this)),
                "打开追光灯"
        );
    }

    @Override
    public void turnOnPrint() throws InterruptedException {
        System.out.println("铛铛！");
        Thread.sleep(500);
        System.out.println("追光灯正在追逐演员！");
    }

}
