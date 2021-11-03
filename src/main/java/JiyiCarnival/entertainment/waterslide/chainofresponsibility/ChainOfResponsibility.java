package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WKATZZL
 * 处理抽象类
 */

public class ChainOfResponsibility
{
    /**
     * @return 返回责任链
     */
    public static SlideHandler getChainOfSlide()
    {
        // 游玩四步
        SlideHandler buyTicket = new BuyTicket(SlideHandler.ticket);
        SlideHandler enter = new Enter(SlideHandler.enter);
        SlideHandler play = new Play(SlideHandler.play);
        SlideHandler leave = new Leave(SlideHandler.leave);

        // 设置责任链
        buyTicket.setNextStep(enter);
        enter.setNextStep(play);
        play.setNextStep(leave);
        return buyTicket;
    }

    public static SlideHandler getChainOfSlide(Visitor visitor)
    {
        // 游玩四步
        SlideHandler buyTicket = new BuyTicket(SlideHandler.ticket, visitor);
        SlideHandler enter = new Enter(SlideHandler.enter, visitor);
        SlideHandler play = new Play(SlideHandler.play, visitor);
        SlideHandler leave = new Leave(SlideHandler.leave, visitor);

        // 设置责任链
        buyTicket.setNextStep(enter);
        enter.setNextStep(play);
        play.setNextStep(leave);
        return buyTicket;
    }
}
