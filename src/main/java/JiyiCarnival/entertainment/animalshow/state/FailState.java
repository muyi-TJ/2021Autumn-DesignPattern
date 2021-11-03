package JiyiCarnival.entertainment.animalshow.state;

import JiyiCarnival.Output;
import JiyiCarnival.util.time.Clock;

/**
 * @author Zong
 * 动物表演的失败状态
 */
public class FailState implements State
{

    /**
     * 动物表演状态改变为失败，行为变化 测试模式
     *
     * @param animalShow 动物表演对象
     */
    public void doAction(AnimalShow animalShow)
    {
        String text = "当前状态为： " + "失败";
        Output.output(
                this.getClass().toString(),
                "state",
                String.valueOf(System.identityHashCode(this)),
                text
        );

        animalShow.setState(this);

        text = "表演失败，动物不能获得奖励";
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
        System.out.println("各位游客非常抱歉，由于我们的失误，动物表演出现些意外！");
        Clock.addTime(5 * 60);
        System.out.println("请各位游客耐心等待五分钟。");
        for(int i = 0; i < 6; i++){
            System.out.print('.');
            Thread.sleep(500);
        }
        System.out.print("\n");
    }
}
