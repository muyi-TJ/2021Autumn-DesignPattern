package JiyiCarnival.entertainment.animalshow.state;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 动物表演的休息状态
 */
public class EndShowState implements State
{

    /**
     * 动物表演状态改变为休息，行为变化 测试模式
     *
     * @param animalShow 动物表演对象
     */
    public void doAction(AnimalShow animalShow)
    {
        String text = "当前状态为： " + "休息中";
        Output.output(
                this.getClass().toString(),
                "state",
                String.valueOf(System.identityHashCode(this)),
                text
        );

        animalShow.setState(this);

        text = "休息中，动物离场";
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
        System.out.println("动物表演已经结束啦，动物要去休息啦！");
        animalShow.setState(this);
        System.out.println("祝您观演愉快！再见！");
        Thread.sleep(1000);
    }

}
