package JiyiCarnival.business.hotel.callback;

import JiyiCarnival.Output;

/**
 * 办理退房手续的结果回溯
 */
public class ResultExporter implements CallBack{
    @Override
    public void call(){
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
}
