package JiyiCarnival.business.hotel.callback;

import JiyiCarnival.Output;

/**
 * 简单游客线程类
 */
public class TouristThread extends BaseThreadHolder {
    @Override
    public void run(){
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "游客开始办理旅馆退房手续"
        );
    }
}
