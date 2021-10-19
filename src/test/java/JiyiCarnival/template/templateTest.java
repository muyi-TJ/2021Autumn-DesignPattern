package JiyiCarnival.template;

import JiyiCarnival.entertainment.activate.Template.ActivateTemplate;
import JiyiCarnival.entertainment.activate.Template.activates.BirthdayActivate;
import JiyiCarnival.entertainment.activate.Template.activates.HalloweenActivate;
import org.junit.Test;

public class templateTest {

    @Test
    public void test(){
        System.out.println("模板方法模式测试：");
        ActivateTemplate birthdayActivate = new BirthdayActivate();
        ActivateTemplate halloweenActivate = new HalloweenActivate();
        birthdayActivate.playActivate();
        halloweenActivate.playActivate();
    }
}
