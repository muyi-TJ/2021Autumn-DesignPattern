package JiyiCarnival.entertainment.animalshow.state;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 动物表演的进行中状态
 */
public class BeginShowState implements State
{

    /**
     * 动物表演状态改变为进行中，行为变化 测试模式
     *
     * @param animalShow 动物表演对象
     */
    public void doAction(AnimalShow animalShow)
    {
        String text = "当前状态为： " + "进行中";
        Output.output(
                this.getClass().toString(),
                "state",
                String.valueOf(System.identityHashCode(this)),
                text
        );

        animalShow.setState(this);

        text = "表演进行中，动物登场";
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
        System.out.println("表演已经开始啦！");
        Thread.sleep(1000);
        animalShow.setState(this);
    }
}
