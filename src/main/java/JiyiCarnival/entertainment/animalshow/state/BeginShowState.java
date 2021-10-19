package JiyiCarnival.entertainment.animalshow.state;

/**
 * @author Zong
 * 动物表演的进行中状态
 */
public class BeginShowState implements State {

    /**
     * 动物表演状态改变为进行中，行为变化
     * @param animalShow 动物表演对象
     */
    public void doAction(AnimalShow animalShow) {
        System.out.println("动物表演进行中：");
        animalShow.setState(this);
    }

    public String toString() {
        return "表演进行中，动物登场";
    }
}
