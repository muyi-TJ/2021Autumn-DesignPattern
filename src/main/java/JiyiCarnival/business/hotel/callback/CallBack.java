package JiyiCarnival.business.hotel.callback;

/**
 * 回调模式接口
 */
public interface CallBack
{
    /**
     * 事情结束后回溯
     */
    void call() throws InterruptedException;
}
