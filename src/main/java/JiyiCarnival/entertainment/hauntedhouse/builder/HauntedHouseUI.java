package JiyiCarnival.entertainment.hauntedhouse.builder;

import JiyiCarnival.entertainment.hauntedhouse.builder.*;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.time.Clock;


public class HauntedHouseUI extends Controller{
    public void flowControl() throws InterruptedException {
        int huantChoice=3;
        System.out.println("生人勿近，胆小勿入……欢迎来到济忆鬼屋！");
        System.out.println("济忆鬼屋共有两条游玩路线供您选择：");
        HauntedHouseDirector hauntedHouseDirector = new HauntedHouseDirector();
        /*
         * 建造并显示第一条游玩路线
         */
        HauntedHouseBuilder hardHauntedHouseBuilder = new HardHauntedHouse();
        hauntedHouseDirector.setHauntedHouseBuilder(hardHauntedHouseBuilder);
        hauntedHouseDirector.construct();
        HauntedHouse hardHauntedHouse = hardHauntedHouseBuilder.build();
        /*
         * 建造并显示第二条游玩路线
         */
        HauntedHouseBuilder simpleHauntedHouseBuilder = new SimpleHauntedHouse();
        hauntedHouseDirector.setHauntedHouseBuilder(simpleHauntedHouseBuilder);
        hauntedHouseDirector.construct();
        HauntedHouse simpleHauntedHouse = simpleHauntedHouseBuilder.build();
        System.out.println("-----------------------");
        System.out.println("请选择您要游玩的路线：\n[1] 简单模式\n[2] 困难模式\n[0] 离开");
        System.out.println("-----------------------");
        huantChoice = Input.input();
        switch (huantChoice) {
            case 2:
                hardHauntedHouse.play();
                for(int i = 0; i < 10; i++){
                    System.out.print("👻");
                    Thread.sleep(100);
                    System.out.print("☠");
                    Thread.sleep(100);
                    System.out.print("👹");
                    Thread.sleep(100);
                }
                System.out.println("\n恭喜您闯关成功！！");
                Thread.sleep(1000);
                Clock.addTime(30);
                break;
            case 1:
                simpleHauntedHouse.play();
                for(int i = 0; i < 10; i++){
                    System.out.print("👻");
                    Thread.sleep(100);
                    System.out.print("🦇");
                    Thread.sleep(100);
                }
                System.out.println("\n恭喜您闯关成功！！");
                Thread.sleep(1000);
                Clock.addTime(15);
                break;
            case 0:
                return;
            default:
                System.out.println("输入有误，请重新输入");
        }
    }
}
