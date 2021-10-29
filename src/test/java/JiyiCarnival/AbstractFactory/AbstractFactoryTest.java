package JiyiCarnival.AbstractFactory;

import JiyiCarnival.entertainment.stage.abstractfactory.*;

import junit.framework.TestCase;
import org.junit.Test;

public class AbstractFactoryTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("抽象工厂模式测试：");
        AbstractFactory lighting= FactoryProducer.getFactory("Lighting");
        AbstractFactory item=FactoryProducer.getFactory("Item");

        Lighting laser= lighting.getLighting("Laser");
        laser.turnOn();
        Lighting movinghead= lighting.getLighting("MovingHead");
        movinghead.turnOn();
        Lighting tracing= lighting.getLighting("TracingLamp");
        tracing.turnOn();

        Item ribbon=item.getItem("ColouredRibbon");
        ribbon.useItem();
        Item sprinkler= item.getItem("Sprinkler");
        sprinkler.useItem();
        Item fog= item.getItem("StageFog");
        fog.useItem();
    }
}
