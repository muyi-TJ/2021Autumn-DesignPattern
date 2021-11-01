package JiyiCarnival.entertainment.animalshow.state;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 动物表演的失败状态
 */
public class FailState implements State
{

    /**
     * 动物表演状态改变为失败，行为变化
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
}
