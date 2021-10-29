package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

import JiyiCarnival.Output;

/**
 * @author WKATZZL
 * 处理抽象类
 */
public class Enter extends SlideHandler{
    /**
     *
     * @param step 进入水上滑梯所对应的步骤
     */
    public Enter(int step){
        super(enter);
    }

    /**
     * 输出当前需要进行的处理信息
     */
    @Override
    protected void handle(){
        Output.output(this.getClass().toString(),
                "handle",
                String.valueOf(System.identityHashCode(this)),
                "游客进入水上滑梯"
        );
    }

}
