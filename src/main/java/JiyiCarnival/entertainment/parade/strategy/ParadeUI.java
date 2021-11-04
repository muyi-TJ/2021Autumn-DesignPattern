package JiyiCarnival.entertainment.parade.strategy;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.time.Clock;

public class ParadeUI extends Controller {
    public void flowControl() throws InterruptedException {
        if(!Clock.timeCheck(18, 22)){
            Clock.printNowTime();
            System.out.print("尊敬的游客，很抱歉！现在不在花车的乘坐时间哦！");
            System.out.println("请注意查看公告栏上各游乐地点的开放时间！");
            return;
        }
        Parade parade = new Parade();
        System.out.println("尊敬的" + JiyiCarnival.getVisitor().getName() + "，请选择您的巡游路线");
        System.out.println("[1] 浪漫路线 [2] 刺激路线");
        int choice = Input.input();
        while(choice != 1 && choice != 2){
            System.out.println("没有该路线哦，请重新选择：");
            choice = Input.input();
        }
        if(choice == 1){
            ParadeRoute route1 = new RouteOne();
            parade.setRoute(route1);
            parade.paradeRoutePrint();
            Clock.addTime(45);
        }
        else{
            ParadeRoute route2 = new RouteTwo();
            parade.setRoute(route2);
            parade.paradeRoutePrint();
            Clock.addTime(50);
        }


    }
}
