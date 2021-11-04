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
        control.nextSource("今日热气球检修，暂停对外开放。");
        control.nextSource("今日游乐园餐厅全部菜品九折优惠。");
        control.loop();
        System.out.println("输入1对公告栏内容进行一次查看，输入其他数字离开公告栏：");
        int ans = Input.input();
        if(ans == 1)
        {
            blackboard.inspect();
        }
    }
}
