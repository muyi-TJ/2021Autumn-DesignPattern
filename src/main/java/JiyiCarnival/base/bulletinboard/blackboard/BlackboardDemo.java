package JiyiCarnival.base.bulletinboard.blackboard;

import JiyiCarnival.util.input.Input;

/**
 * 一个公告栏的示例
 * @author Caviar011230
 */
public class BlackboardDemo
{
    public static void demo()
    {
        Blackboard blackboard = new Blackboard();
        Control control = new Control(blackboard);
        control.nextSource("今日游乐园设施一切正常，敬请期待！");
        control.nextSource("今日游乐园餐厅推出新产品！");
        //TODO 写入各项游乐活动的时间
        control.loopNonPrint();
        blackboard.inspectPrint();
    }
}
