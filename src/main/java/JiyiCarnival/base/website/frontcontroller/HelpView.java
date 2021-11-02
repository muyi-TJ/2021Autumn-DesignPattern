package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 创建帮助中心视图类
 */
public class HelpView
{
    /**
     * 展示帮助中心视图 测试模式
     */
    public void show()
    {
        String text = "欢迎来到帮助中心，请随意向我们寻求帮助！";
        Output.output(
                this.getClass().toString(),
                "show",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 帮助中心视图 游乐园模式
     * @return 购票的游
     */
    public void view(){
        System.out.println("欢迎来到帮助中心，请随意向我们寻求帮助！");
    }
}
