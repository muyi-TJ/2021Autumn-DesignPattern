package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 创建主页视图类
 */
public class HomeView
{
    /**
     * 展示主页视图 测试模式
     */
    public void show()
    {
        String text = "欢迎来到济忆嘉年华，在这里度过美妙的一天吧！";
        Output.output(
                this.getClass().toString(),
                "show",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 游乐园模式
     */
    public void view(){
        System.out.println("欢迎来到济忆嘉年华官网，在这里度过美妙的一天吧！");
    }
}