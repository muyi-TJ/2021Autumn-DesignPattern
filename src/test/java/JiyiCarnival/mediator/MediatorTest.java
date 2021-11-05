//package JiyiCarnival.mediator;
//
//import JiyiCarnival.Output;
//import JiyiCarnival.base.bikes.mediator.StationMediator;
//import JiyiCarnival.base.bikes.mediator.StationOne;
//import JiyiCarnival.base.bikes.mediator.StationThree;
//import JiyiCarnival.base.bikes.mediator.StationTwo;
//import JiyiCarnival.util.input.Input;
//import org.junit.Test;
//
//public class MediatorTest
//{
//    @Test
//    /*
//     *@param need游客需要的单车数量
//     */
//   public static void main(String[] args)
////    public void test()
//    {
//        System.out.println("中介者模式测试：");
//        int bikeChoice=5;
//        int need=0;
//        StationMediator stationMediator = new StationMediator();
//        StationOne stationOne = new StationOne("游客中心", 150);
//        StationTwo stationTwo = new StationTwo("美食天堂入口", 100);
//        StationThree stationThree = new StationThree("幻想世界入口", 80);
//        System.out.println("-----------------------");
//        System.out.println("请选择您要租赁共享单车的站点：\n[1] 游客中心\n[2] 美食天堂入口\n[3] 幻想世界入口\n[0] 退出");
//        System.out.println("-----------------------");
//        bikeChoice = Input.input();
//        switch (bikeChoice){
//            case 1:
//                stationOne.setBikeMediator(stationMediator);
//                System.out.println("请输入您需要的单车数量：");
//                need=Input.input();
//                stationOne.sendMessage("需要"+need+"辆共享单车");
//                stationOne.readMessage(stationOne);
//                break;
//            case 2:
//                stationTwo.setBikeMediator(stationMediator);
//                System.out.println("请输入您需要的单车数量：");
//                need=Input.input();
//                stationTwo.sendMessage("需要"+need+"辆共享单车");
//                stationTwo.readMessage(stationTwo);
//                break;
//            case 3:
//                stationThree.setBikeMediator(stationMediator);
//                System.out.println("请输入您需要的单车数量：");
//                need=Input.input();
//                stationThree.sendMessage("需要"+need+"辆共享单车");
//                stationThree.readMessage(stationThree);
//                break;
//            case 0:
//                return;
//            default:
//                System.out.println("输入有误，请重新输入");
//        }
//        Output.output(
//                this.getClass().toString(),
//                "initialize",
//                String.valueOf(System.identityHashCode(this)),
//                "站点向中介系统提出需求"
//        );

//
//        stationThree.sendMessage("需要5辆共享单车");

//    }
//}
package JiyiCarnival.mediator;

import JiyiCarnival.Output;
import JiyiCarnival.base.bikes.mediator.StationMediator;
import JiyiCarnival.base.bikes.mediator.StationOne;
import JiyiCarnival.base.bikes.mediator.StationThree;
import JiyiCarnival.base.bikes.mediator.StationTwo;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class MediatorTest {
    @Test
    public void test(){
        System.out.println("中介者模式测试：");
        StationMediator stationMediator=new StationMediator();
        StationOne stationOne=new StationOne("StationOne",15);
        StationTwo stationTwo=new StationTwo("StationTwo",10);
        StationThree stationThree=new StationThree("StationThree",5);
        stationOne.setBikeMediatorLog(stationMediator);
        stationTwo.setBikeMediatorLog(stationMediator);
        stationThree.setBikeMediatorLog(stationMediator);

        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "站点向中介系统提出需求"
        );
        stationOne.sendMessageLog("需要3辆共享单车");
        stationTwo.sendMessageLog("多余6辆共享单车");
        stationThree.sendMessageLog("需要5辆共享单车");
    }
}
