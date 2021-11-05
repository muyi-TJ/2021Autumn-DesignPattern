package JiyiCarnival.entertainment.animalshow.state;

/**
 * @author Zong
 * 动物表演对象
 */
public class AnimalShow
{

    private String[] animals = {"狮子", "狗狗", "猴子", "猩猩"};
    private String[] performances = {"钻火圈", "顶球", "走钢丝"};
    private State state; // 演出的状态

    public AnimalShow()
    {
        this.state = null;
    }

    /**
     * 获取演出状态
     *
     * @return 现状态
     */
    public State getState()
    {
        return state;
    }

    /**
     * 设置演出状态
     *
     * @param state 新状态
     */
    public void setState(State state)
    {
        this.state = state;
    }

    /**
     * 动物表演杂技
     */
    public void show() throws InterruptedException {
        String animal = animals[(int) (Math.random() * animals.length)];
        String performance = performances[(int) (Math.random() * performances.length)];
        System.out.println("今日的表演是：");
        System.out.println(animal + performance + "!!!");
        System.out.println("敬请欣赏！");
        for(int i = 0; i < 5; i++){
            System.out.print('.');
            Thread.sleep(200);
        }
    }

}
