//package JiyiCarnival.bulider;
//
//import JiyiCarnival.entertainment.hauntedhouse.builder.*;
//import JiyiCarnival.util.input.Input;
//import org.junit.Test;
//
//public class HauntedHouseTest
//{
//    @Test
//    public static void main(String[] args)
////    public void testBuilder()
//    {
//        /*
//        @param huantChoice记录游客选择的路线
//         */
//        int huantChoice=3;
//
//        System.out.println("生人勿近，胆小勿入……欢迎来到济忆鬼屋！");
//        System.out.println("济忆鬼屋共有两条游玩路线供您选择：");
//        HauntedHouseDirector hauntedHouseDirector = new HauntedHouseDirector();
//        /*
//         * 建造并显示第一条游玩路线
//         */
//        HauntedHouseBuilder hardHauntedHouseBuilder = new HardHauntedHouse();
//        hauntedHouseDirector.setHauntedHouseBuilder(hardHauntedHouseBuilder);
//        hauntedHouseDirector.construct();
//        HauntedHouse hardHauntedHouse = hardHauntedHouseBuilder.build();
//        /*
//         * 建造并显示第二条游玩路线
//         */
//        HauntedHouseBuilder simpleHauntedHouseBuilder = new SimpleHauntedHouse();
//        hauntedHouseDirector.setHauntedHouseBuilder(simpleHauntedHouseBuilder);
//        hauntedHouseDirector.construct();
//        HauntedHouse simpleHauntedHouse = simpleHauntedHouseBuilder.build();
//        System.out.println("-----------------------");
//        System.out.println("请选择您要游玩的路线：\n[1] 简单模式\n[2] 困难模式\n[0]离开");
//        System.out.println("-----------------------");
//        huantChoice = Input.input();
//        switch (huantChoice){
//            case 1:
//                hardHauntedHouse.play();
//                System.out.println("恭喜您闯关成功！！");
//                break;
//            case 2:
//                simpleHauntedHouse.play();
//                System.out.println("恭喜您闯关成功！！");
//                break;
//            case 0:
//                return;
//            default:
//                System.out.println("输入有误，请重新输入");
//        }
//
//    }
//}





package JiyiCarnival.bulider;

import JiyiCarnival.entertainment.hauntedhouse.builder.*;
import org.junit.jupiter.api.Test;


public class HauntedHouseTest {
    @Test
    public void testBuilder(){
        HauntedHouseDirector hauntedHouseDirector=new HauntedHouseDirector();

        HauntedHouseBuilder hardHauntedHouseBuilder=new HardHauntedHouseLog();
        hauntedHouseDirector.setHauntedHouseBuilder(hardHauntedHouseBuilder);
        hauntedHouseDirector.constructLog();
        HauntedHouse hardHauntedHouse=hardHauntedHouseBuilder.buildLog();
        hardHauntedHouse.playLog();

        HauntedHouseBuilder simpleHauntedHouseBuilder=new SimpleHauntedHouseLog();
        hauntedHouseDirector.setHauntedHouseBuilder(simpleHauntedHouseBuilder);
        hauntedHouseDirector.constructLog();
        HauntedHouse simpleHauntedHouse=simpleHauntedHouseBuilder.buildLog();
        simpleHauntedHouse.playLog();

    }
}

