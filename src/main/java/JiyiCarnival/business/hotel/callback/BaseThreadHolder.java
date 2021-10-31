package JiyiCarnival.business.hotel.callback;

/**
 * 线程管理抽象类
 */
abstract public class BaseThreadHolder {
    /**
     *回调调用
     * @param callBack
     */
    public final void run(CallBack callBack){
        run();
        if(callBack!=null){
            callBack.call();
        }
    }
    /**
     * 开始事件
     */
    public abstract void run();
}
