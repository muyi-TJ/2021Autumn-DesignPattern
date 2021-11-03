package JiyiCarnival.entertainment.parade.strategy;

/**
 * @author Rounds-Chen
 * <p>
 * 花车巡游接口类
 */
public interface ParadeRoute
{
    /**
     * 巡游 测试模式
     */
    void parade();

    /**
     * 巡游 游乐园模式
     */
    void print() throws InterruptedException;
}
