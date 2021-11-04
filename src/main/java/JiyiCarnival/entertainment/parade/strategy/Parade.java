package JiyiCarnival.entertainment.parade.strategy;

/**
 * @author Rounds-Chen
 * <p>
 * 游行类
 */
public class Parade
{
    private ParadeRoute route;

    /**
     * 设置游行路线策略
     *
     * @param route 待设置的游行策略
     */
    public void setRoute(ParadeRoute route)
    {
        this.route = route;
    }

    /**
     * 执行花车游行
     */
    public void parade()
    {
        this.route.parade();
    }

    /**
     * 执行花车游行
     */
    public void paradeRoutePrint() throws InterruptedException {
        this.route.print();
    }
}
