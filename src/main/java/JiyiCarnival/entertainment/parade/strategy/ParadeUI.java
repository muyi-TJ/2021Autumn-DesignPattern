package JiyiCarnival.entertainment.parade.strategy;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.input.Input;

public class ParadeUI extends Controller {
    public void flowControl() throws InterruptedException {
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
        }
        else{
            ParadeRoute route2 = new RouteTwo();
            parade.setRoute(route2);
            parade.paradeRoutePrint();
        }


    }
}
