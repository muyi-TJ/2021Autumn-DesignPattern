package JiyiCarnival.entertainment.waterslide.chainofresponsibility;
/**
 * @author WKATZZL
 * 处理抽象类
 */
public class Play extends SlideHandler{
    /**
     *
     * @param step 游玩水上滑梯所对应的步骤
     */
    public Play(int step){
        super(play);
    }

    /**
     * 输出当前需要进行的处理信息
     */
    @Override
    protected void handle(){
        System.out.println("游客游玩水上滑梯。");
    }
}
