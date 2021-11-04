package JiyiCarnival.base.bikes.mediator;

import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.control.Controller;

public class BikesUI {
    public void flowControl() {
        int bikeChoice = 5;
        int need = 0;
        StationMediator stationMediator = new StationMediator();
        StationOne stationOne = new StationOne("游客中心", 150);
        StationTwo stationTwo = new StationTwo("美食天堂入口", 100);
        StationThree stationThree = new StationThree("幻想世界入口", 80);
        System.out.println("-----------------------");
        System.out.println("请选择您要租赁共享单车的站点：\n[1] 游客中心\n[2] 美食天堂入口\n[3] 幻想世界入口\n[0] 退出");
        System.out.println("-----------------------");
        bikeChoice = Input.input();
        switch (bikeChoice) {
            case 1:
                stationOne.setBikeMediator(stationMediator);
                System.out.println("请输入您需要的单车数量：");
                need = Input.input();
                stationOne.sendMessage("需要" + need + "辆共享单车");
                stationOne.readMessage(stationOne);
                break;
            case 2:
                stationTwo.setBikeMediator(stationMediator);
                System.out.println("请输入您需要的单车数量：");
                need = Input.input();
                stationTwo.sendMessage("需要" + need + "辆共享单车");
                stationTwo.readMessage(stationTwo);
                break;
            case 3:
                stationThree.setBikeMediator(stationMediator);
                System.out.println("请输入您需要的单车数量：");
                need = Input.input();
                stationThree.sendMessage("需要" + need + "辆共享单车");
                stationThree.readMessage(stationThree);
                break;
            case 0:
                return;
            default:
                System.out.println("输入有误，请重新输入");
        }
    }
}
