package JiyiCarnival.entertainment.animalshow.state;

import JiyiCarnival.Output;
import JiyiCarnival.util.time.Clock;

/**
 * @author Zong
 * 动物表演的成功状态
 */
public class SucceedState implements State
{

    /**
     * 动物表演状态改变为成功，行为变化 测试模式
     *
     * @param animalShow 动物表演对象
     */
    public void doAction(AnimalShow animalShow)
    {
        String text = "当前状态为： " + "成功";
        Output.output(
                this.getClass().toString(),
                "state",
                String.valueOf(System.identityHashCode(this)),
                text
        );

        animalShow.setState(this);

        text = "表演成功，动物获得奖励";
        Output.output(
                this.getClass().toString(),
                "action",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 动物表演状态改变为失败，行为变化 游乐园模式
     *
     * @param animalShow 动物表演对象
     */
    public void printAction(AnimalShow animalShow) throws InterruptedException {
        animalShow.show();
        System.out.println("今日的演出非常成功！");
        Thread.sleep(1000);
    }
}
