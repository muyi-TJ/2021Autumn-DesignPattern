package JiyiCarnival.entertainment.animalshow.state;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 动物表演的进行中状态
 */
public class BeginShowState implements State
{

    /**
     * 动物表演状态改变为进行中，行为变化
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
}
