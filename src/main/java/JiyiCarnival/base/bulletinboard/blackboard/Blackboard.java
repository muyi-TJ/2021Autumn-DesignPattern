package JiyiCarnival.base.bulletinboard.blackboard;

import JiyiCarnival.Output;

import java.util.ArrayList;

/**
 * @author Caviar011230
 * 黑板类
 */
public class Blackboard
{
    ArrayList<String> noticeList;

    public Blackboard()
    {
        noticeList = new ArrayList<>();
    }

    /**
     * 向黑板类添加新公告 测试模式
     *
     * @param newNotice 新公告内容
     */
    public void update(String newNotice)
    {
        noticeList.add(newNotice);
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "添加了第" + noticeList.size() + "条公告"
        );
    }

    /**
     * 向黑板类添加新公告 游乐园模式
     *
     * @param newNotice 新公告内容
     */
    public void updateNonPrint(String newNotice)
    {
        noticeList.add(newNotice);
    }

    /**
     * 逐条展示黑板中的公告 测试模式
     */
    public void inspect()
    {
        for (int i = 0; i < noticeList.size(); i++)
        {
            Output.output(
                    this.getClass().toString(),
                    "initialize",
                    String.valueOf(System.identityHashCode(this)),
                    "Blackboard:inspect:第" + (i + 1) + "条公告为：" + noticeList.get(i)
            );
        }
    }



    /**
     * 逐条展示黑板中的公告 游乐园模式
     */
    public void inspectPrint()
    {
        for (int i = 0; i < noticeList.size(); i++)
        {
            System.out.println("公告" + (i + 1) + noticeList.get(i));
        }
    }
}
