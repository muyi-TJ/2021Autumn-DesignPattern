package JiyiCarnival.business.hotel.callback;

import JiyiCarnival.Output;

/**
 * 办理退房手续的结果回溯
 */
public class ResultExporter implements CallBack
{
    private String state = "test";

    public ResultExporter(){}

    /**
     * 重载构造函数
     * @param state 状态
     */
    public ResultExporter(String state){
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
    public void call() throws InterruptedException {
        if(state == "test") {
            Output.output(
                    this.getClass().toString(),
                    "initialize",
                    String.valueOf(System.identityHashCode(this)),
                    "手续处理中..."
            );
            Output.output(
                    this.getClass().toString(),
                    "initialize",
                    String.valueOf(System.identityHashCode(this)),
                    "手续处理中..."
            );
            Output.output(
                    this.getClass().toString(),
                    "initialize",
                    String.valueOf(System.identityHashCode(this)),
                    "手续处理中..."
            );
            Output.output(
                    this.getClass().toString(),
                    "initialize",
                    String.valueOf(System.identityHashCode(this)),
                    "办理退房手续成功，旅客离开旅店"
            );
        }
        else{
            System.out.println("退订手续办理中，请稍后");
            for(int i = 0; i < 6; i++){
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println("\n办理退房手续成功，非常感谢您的入住，再见！");
        }
    }
}
