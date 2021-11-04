package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;
import JiyiCarnival.office.recruit.dependencyinjection.NewspaperRecruitChannel;
import JiyiCarnival.office.recruit.dependencyinjection.OnlineRecruitChannel;
import JiyiCarnival.office.recruit.dependencyinjection.RecruitPublisher;
import JiyiCarnival.office.recruit.dependencyinjection.Recruitment;

/**
 * @author Zong
 * 创建招聘通知视图类
 */
public class RecruitView
{
    private String msg = "暂无招聘需求哦！请耐心等待！";
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


    public void setMsg(String msg){
        this.msg = msg;
    }


    /**
     * 展示招聘通知视图 游乐园模式
     */
    public void view(){
        System.out.println("在这里查看招聘通知，快来报名心仪的岗位！");
        RecruitPublisher publisher = new RecruitPublisher();
        OnlineRecruitChannel online = new OnlineRecruitChannel();
        Recruitment recruitment = new Recruitment(msg);
        publisher.publishPrint(recruitment, online);
    }

}
