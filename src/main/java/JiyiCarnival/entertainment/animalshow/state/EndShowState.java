package JiyiCarnival.entertainment.animalshow.state;

/**
 * @author Zong
 * 动物表演的休息状态
 */
public class EndShowState implements State {

    /**
     * 动物表演状态改变为休息，行为变化
     * @param animalShow 动物表演对象
     */
    public void doAction(AnimalShow animalShow) {
        System.out.println("动物表演休息中：");
        animalShow.setState(this);
    }

    public String toString(){
        return "休息中，动物离场";
    }
}
