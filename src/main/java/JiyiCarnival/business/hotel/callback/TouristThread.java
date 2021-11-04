package JiyiCarnival.business.hotel.callback;

import JiyiCarnival.Output;

/**
 * 简单游客线程类
 */
public class TouristThread extends BaseThreadHolder
{
    private String state = "test";

    public TouristThread(){}

    /**
     * 重载构造函数
     * @param state 状态
     */
    public TouristThread(String state){
        this.state = state;
    }
    /**
     * 设置状态
     * @param state 状态
     */
    public void setState(String state){
        this.state = state;
    }
    @Override
    public void run() throws InterruptedException {
        if(state == "test") {
            Output.output(
                    this.getClass().toString(),
                    "initialize",
                    String.valueOf(System.identityHashCode(this)),
                    "游客开始办理旅馆退房手续"
            );
        }
        else{
            System.out.println("开始办理旅馆退房手续");
            Thread.sleep(1000);
        }
    }
}
