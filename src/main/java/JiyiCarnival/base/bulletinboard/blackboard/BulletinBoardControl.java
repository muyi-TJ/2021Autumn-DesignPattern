package JiyiCarnival.base.bulletinboard.blackboard;

import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.time.Clock;

/**
 * 一个公告栏的示例
 * @author Caviar011230
 */
public class BulletinBoardControl extends Controller
{
    public void flowControl()
    {
        Blackboard blackboard = new Blackboard();
        Control control = new Control(blackboard);
        control.nextSource("主题活动   开放时间");
        control.nextSource("水上滑梯   9:00~3:00");
        control.nextSource("电影放映   12:00~14:00");
        control.nextSource("动物表演   15:00~17:00");
        control.nextSource("气球之旅   16:00~17:00");
        control.nextSource("刺激射击   18:00~22:00");
        control.nextSource("浪漫花车   18:00~22:00");
        control.nextSource("天真木马   18:00~22:00");
        control.nextSource("精彩烟花   18:00~22:00");
        control.nextSource("今日游乐园设施一切正常，敬请期待！");
        control.nextSource("今日游乐园KCF餐厅推出新产品！");
        control.loopNonPrint();
        blackboard.inspectPrint();
        Clock.addTime(5);
    }
}
