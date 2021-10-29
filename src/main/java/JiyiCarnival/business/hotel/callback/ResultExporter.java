package JiyiCarnival.business.hotel.callback;

/**
 * 办理退房手续的结果回溯
 */
public class ResultExporter implements CallBack{
    @Override
    public void call(){
        System.out.println("手续处理中...");
        System.out.println("手续处理中...");
        System.out.println("手续处理中...");
        String msg = "办理退房手续成功，旅客离开旅店";
        System.out.println(msg);
    }
}
