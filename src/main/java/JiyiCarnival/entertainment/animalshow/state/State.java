package JiyiCarnival.entertainment.animalshow.state;

/**
 * @author Zong
 * 动物表演的状态
 */

public interface State
{
    /**
     * 显示动物表演的状态 测试模式
     *
     * @param animalShow 某次表演
     */
    void doAction(AnimalShow animalShow);

    /**
     * 显示动物表演的状态 游乐园模式
     * @param animalShow 某次表演
     */
    void printAction(AnimalShow animalShow) throws InterruptedException;
}
