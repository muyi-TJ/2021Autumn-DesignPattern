package JiyiCarnival.entertainment.animalshow.state;

/**
 * @author Zong
 * 动物表演对象
 */
public class AnimalShow {
    // 演出的状态
    private State state;

    public AnimalShow() {
        this.state = null;
    }

    /**
     * 设置演出状态
     * @param state 新状态
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * 获取演出状态
     * @return 现状态
     */
    public State getState() {
        return state;
    }

}
