package JiyiCarnival.entertainment.waterslide.chainofresponsibility;
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
        System.out.println("游客进入水上滑梯。");
    }

}
