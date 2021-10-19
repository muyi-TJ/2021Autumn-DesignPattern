package JiyiCarnival.entertainment.animalshow.state;

/**
 * @author Zong
 * 动物表演的成功状态
 */
public class SucceedState implements State {

    /**
     * 动物表演状态改变为成功，行为变化
     * @param animalShow 动物表演对象
     */
    public void doAction(AnimalShow animalShow) {
        System.out.println("动物表演成功：");
        animalShow.setState(this);
    }

    public String toString(){
        return "表演成功，动物获得奖励";
    }
}
