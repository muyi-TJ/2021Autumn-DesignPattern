package JiyiCarnival.business.hotel.callback;

/**
 * 简单游客线程类
 */
public class TouristThread extends BaseThreadHolder {
    @Override
    public void run(){
        String msg = "游客开始办理旅馆退房手续";
        System.out.println(msg);
    }
}
