package JiyiCarnival.entertainment.animalshow.state;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 动物表演的休息状态
 */
public class EndShowState implements State
{

    /**
     * 动物表演状态改变为休息，行为变化
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
}
