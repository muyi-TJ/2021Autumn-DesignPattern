package JiyiCarnival.blackboard;

import JiyiCarnival.base.bulletinboard.blackboard.Blackboard;
import JiyiCarnival.base.bulletinboard.blackboard.Control;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class BlackboardTest
{
    @Test
    public void test()
    {
        System.out.println("黑板模式测试：");
        Blackboard blackboard = new Blackboard();
        Control control = new Control(blackboard);
        control.nextSource("今日热气球检修，暂停对外开放。");
        control.nextSource("今日游乐园餐厅全部菜品九折优惠。");
        control.loop();
        blackboard.inspect();
    }
}
