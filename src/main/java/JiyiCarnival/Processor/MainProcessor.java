package JiyiCarnival.Processor;


import JiyiCarnival.base.broadcast.eventqueue.Broadcast;
import JiyiCarnival.base.broadcast.eventqueue.Message;
import JiyiCarnival.base.parkinglot.observe.Broadcaster;
import JiyiCarnival.base.parkinglot.observe.CarDetectMachine;
import JiyiCarnival.base.parkinglot.observe.Screen;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.business.hotel.callback.UnsubscribeControl;
import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.entertainment.equipments.visitor.*;
import JiyiCarnival.service.securitycheck.facade.SecurityCheckFacade;
import JiyiCarnival.util.time.Clock;
import JiyiCarnival.util.visitor.Visitor;

import java.io.IOException;
import java.text.ParseException;

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
    public void flowControl() throws InterruptedException, IOException, ParseException {
        System.out.println("--------------------------------------------");
        System.out.println("为了更好的娱乐体验，" + visitor.getName() + "决定提前一天到达游乐园，并在预定的宾馆中休息了一晚。");
        for(int i = 0; i < 15; i++){
            System.out.print('.');
            Thread.sleep(200);
        }
        System.out.println();
        JiyiCarnival.setClock();
        Clock.printNowTime();
        System.out.println("\n天已经亮了！");
        System.out.println("");
        Thread.sleep(500);
        System.out.println("今天是个" + JiyiCarnival.getWeather() +
                "，尽管温度已经到达了" + JiyiCarnival.getTemperature() + "摄氏度，但是，这依然是个好天气呢！");
        System.out.println("-----------------------------------------------------");
        System.out.println("(济忆嘉年华开园前，园内管理员正仔细检查各个大型游乐设施……)");
        UncheckedEquipmentUI uncheckedEquipmentUI = new UncheckedEquipmentUI();
        uncheckedEquipmentUI.flowControl();
        System.out.println("-----------------------------------------------------");
        System.out.println("您驾车来到了停车场……");
        System.out.println("尊敬的游客，请您先将车停到停车场中。");
        CarDetectMachine detectMachine = new CarDetectMachine(100, 66);
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
        Clock.addTime(30);
        Broadcast broadcast = new Broadcast(1);
        broadcast.init();
        broadcast.addMessage(new Message("尊敬的" + visitor.getName() +"，您准备好了吗？" + "济忆自由之旅就要开始啦！"));
        Thread.sleep(1000);
        broadcast.stop();
        System.out.println();
        ZoneProcessor zoneProcessor = new ZoneProcessor(visitor, ticket);
        zoneProcessor.freeRoute();
        Clock.printNowTime();
        UnsubscribeControl unsubscribeControl = new UnsubscribeControl();
        unsubscribeControl.flowControl();
    }
}
