package JiyiCarnival.entertainment.animalshow.state;

/**
 * @author Zong
 * 动物表演的失败状态
 */
public class FailState implements State {

    /**
     * 动物表演状态改变为失败，行为变化
     * @param animalShow 动物表演对象
     */
    public void doAction(AnimalShow animalShow) {
        System.out.println("动物表演失败：");
        animalShow.setState(this);
    }

    public String toString(){
        return "表演失败，动物不能获得奖励";
    }
}
