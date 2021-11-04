package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.entertainment.facilityspecification.specification.Specification;
import JiyiCarnival.entertainment.facilityspecification.specification.VisitorAgeSpecification;
import JiyiCarnival.entertainment.facilityspecification.specification.VisitorHeightSpecification;
import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WKATZZL
 * 水上滑梯控制类
 */

public class WaterSlideControl extends Controller {
    /**
     * 流程控制
     * @throws InterruptedException 使用了线程睡眠
     */
    public void flowControl() throws InterruptedException {
        Visitor visitor = JiyiCarnival.getVisitor();
        System.out.println("欢迎来到水上滑梯大型游玩项目！\n");
        System.out.println("为了您的人身安全，请在游玩前确保您已满足游玩条件：儿童年龄不得低于12岁，身高不得小于140cm。满足游玩条件后请前往售票处购票，祝您游玩愉快！\n");
        System.out.println("游客规约检测loading……");
        Specification<Visitor> specificationOne = (new VisitorAgeSpecification(12)).and(new VisitorHeightSpecification(140.0D));
        if(specificationOne.isSatisfiedBy(visitor)){
            SlideHandler slideChain = ChainOfResponsibility.getChainOfSlide(visitor);
            Request request = new Request(4);
            slideChain.handleVisitorRequest(request);
        }
        else{
            System.out.println("非常抱歉，您并未满足游玩条件，可以选择游玩其他项目，祝您游玩愉快！");
        }
    }
}
