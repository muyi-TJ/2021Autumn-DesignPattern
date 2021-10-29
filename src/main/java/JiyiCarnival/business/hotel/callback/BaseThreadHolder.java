package JiyiCarnival.business.hotel.callback;

/**
 * 线程管理抽象类
 */
abstract public class BaseThreadHolder {
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
