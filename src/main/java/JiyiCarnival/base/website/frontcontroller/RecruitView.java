package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 创建招聘通知视图类
 */
public class RecruitView
{
    /**
     * 展示招聘通知视图 测试模式
     */
    public void show()
    {
        String text = "在这里查看招聘通知，快来报名心仪的岗位！";
        Output.output(
                this.getClass().toString(),
                "show",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 展示招聘通知视图 游乐园模式
     */
    public void view(){
        System.out.println("在这里查看招聘通知，快来报名心仪的岗位！");
    }

}
