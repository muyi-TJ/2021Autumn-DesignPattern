package JiyiCarnival.Processor;


import JiyiCarnival.base.parkinglot.observe.Broadcaster;
import JiyiCarnival.base.parkinglot.observe.CarDetectMachine;
import JiyiCarnival.base.parkinglot.observe.Screen;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.business.hotel.callback.UnsubscribeControl;
import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.service.securitycheck.facade.SecurityCheckFacade;
import JiyiCarnival.util.time.Clock;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WKATZZL
 * 早晨游玩处理器类
 */

public class MainProcessor {
    private Visitor visitor = JiyiCarnival.getVisitor();
    private Ticket ticket = JiyiCarnival.getTicket();

    /**
     * 流程控制
     * @throws InterruptedException
     */
    public void flowControl() throws InterruptedException {
        System.out.println("--------------------------------------------");
        System.out.println("为了更好的娱乐体验，" + visitor.getName() + "决定提前一天到达游乐园，并在预定的宾馆中休息了一晚。");
        for(int i = 0; i < 15; i++){
            System.out.print('.');
            Thread.sleep(200);
        }
        System.out.println("\n天已经亮了！");
        Thread.sleep(500);
        System.out.println("今天是个" + JiyiCarnival.getWeather() +
                "，尽管温度已经到达了" + JiyiCarnival.getTemperature() + "摄氏度，但是，这依然是个好天气呢！");

        System.out.println("尊敬的游客，请您先将车停到停车场中。");
        CarDetectMachine detectMachine = new CarDetectMachine(1000, 666);
        Screen screen = new Screen(detectMachine);
        Broadcaster broadcaster = new Broadcaster(detectMachine);
        screen.carUpdate(true);
        detectMachine.visitorCarIn();
        broadcaster.carUpdate(true);
        screen.carUpdate(true);

        SecurityCheckFacade securityCheckFacade = new SecurityCheckFacade();
        System.out.println("尊敬的游客，请先进入安检！");
        if(visitor.getID().length() == 0)
            securityCheckFacade.ordinaryCustomerSecurityCheckPrint();
        else
            securityCheckFacade.specialCustomerSecurityCheckPrint();
        System.out.println("尊敬的" + visitor.getName() +"，您准备好了吗？" + "济忆自由之旅就要开始啦！");
        System.out.println("--------------------------------------------");
        ZoneProcessor zoneProcessor = new ZoneProcessor(visitor, ticket);
        zoneProcessor.freeRoute();
        System.out.println("当前时间为：" + Clock.getClock());
        UnsubscribeControl unsubscribeControl = new UnsubscribeControl();
        unsubscribeControl.flowControl();
    }
}
