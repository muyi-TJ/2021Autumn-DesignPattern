package JiyiCarnival.entertainment.stage.abstractfactory.Lightings;

import JiyiCarnival.Output;
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
        Output.output(this.getClass().toString(),
                "turnOn",
                String.valueOf(System.identityHashCode(this)),
                "打开摇头灯"
        );
    }

    @Override
    public void turnOnPrint() throws InterruptedException {
        System.out.println("铛铛！");
        Thread.sleep(500);
        System.out.println("摇头灯已经摇摆！");
        Thread.sleep(500);
    }

}
