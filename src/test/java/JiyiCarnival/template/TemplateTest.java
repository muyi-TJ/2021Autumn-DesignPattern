package JiyiCarnival.template;

import JiyiCarnival.entertainment.activate.template.ActivateTemplate;
import JiyiCarnival.entertainment.activate.template.activates.BirthdayActivate;
import JiyiCarnival.entertainment.activate.template.activates.HalloweenActivate;
//import org.junit.Test;
import JiyiCarnival.entertainment.parade.strategy.Parade;
import JiyiCarnival.entertainment.parade.strategy.ParadeRoute;
import JiyiCarnival.entertainment.parade.strategy.RouteOne;
import JiyiCarnival.entertainment.parade.strategy.RouteTwo;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class TemplateTest extends TestCase
{

    @Test
    public void test()
    {
        System.out.println("模板方法模式测试：");

        ActivateTemplate birthdayActivate = new BirthdayActivate();
        ActivateTemplate halloweenActivate = new HalloweenActivate();
        birthdayActivate.playActivate();
        halloweenActivate.playActivate();
    }

}
