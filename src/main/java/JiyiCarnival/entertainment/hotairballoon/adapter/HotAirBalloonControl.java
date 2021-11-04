package JiyiCarnival.entertainment.hotairballoon.adapter;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.entertainment.facilityspecification.specification.Specification;
import JiyiCarnival.entertainment.facilityspecification.specification.VisitorAgeSpecification;
import JiyiCarnival.entertainment.facilityspecification.specification.VisitorHeightSpecification;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.ChainOfResponsibility;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.Request;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.SlideHandler;
import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.time.Clock;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WAKTZZL
 * 热气球流程控制类
 */

public class HotAirBalloonControl extends Controller {
    /**
     * 流程控制
     * @throws InterruptedException 使用了线程睡眠
     */
    public void flowControl() throws InterruptedException {
        if(!Clock.timeCheck(16, 17)){
            Clock.printNowTime();
            System.out.print("尊敬的游客，很抱歉！现在不在热气球的乘坐时间哦！");
            System.out.println("请注意查看公告栏上各游乐地点的开放时间！");
            return;
        }
        Visitor visitor = JiyiCarnival.getVisitor();
        System.out.println("欢迎来到热气球大型游玩项目！\n");
        System.out.println("为了您的人身安全，请在游玩前确保您已满足游玩条件：儿童年龄不得低于14岁，老人年龄不得大于60岁。满足游玩条件后请前往售票处购票，祝您游玩愉快！\n");
        System.out.println("游客规约检测loading……");
        Specification<Visitor> specificationOne = (new VisitorAgeSpecification(14)).and(new VisitorAgeSpecification(80).not());
        if(specificationOne.isSatisfiedBy(visitor)){
            HotAirBalloonAdapter hotAirBalloonAdapter = new HotAirBalloonAdapter();
            hotAirBalloonAdapter.setVisitor(visitor);
            hotAirBalloonAdapter.fly();
            Clock.addTime(60);
        }
        else{
            System.out.println("非常抱歉，您并未满足游玩条件，可以选择游玩其他项目，祝您游玩愉快！");
        }
    }

}
