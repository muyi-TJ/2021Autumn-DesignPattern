package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

/**
 * @author WKATZZL
 * 处理抽象类
 */
public class BuyTicket extends SlideHandler{
    /**
     *
     * @param step 买票所对应的步骤
     */
    public BuyTicket(int step){
        super(ticket);
    }

    /**
     * 输出当前需要进行的处理信息
     */
    @Override
    protected void handle(){
        System.out.println("游客购买滑梯门票。");
    }
}
