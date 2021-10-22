package JiyiCarnival.entertainment.waterslide.chainofresponsibility;
/**
 * @author WKATZZL
 * 处理抽象类
 */
public class Leave extends SlideHandler{
    /**
     *
     * @param step 离开水上滑梯所对应的步骤
     */
    public Leave(int step){
        super(leave);
    }

    /**
     * 输出当前需要进行的处理信息
     */
    @Override
    protected void handle(){
        System.out.println("游客离开水上滑梯。");
    }
}
