package JiyiCarnival.entertainment.hauntedhouse.builder;

import JiyiCarnival.entertainment.hauntedhouse.builder.*;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.control.Controller;


public class HauntedHouseUI extends Controller{
    public void flowControl() {
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
        System.out.println("请选择您要游玩的路线：\n[1] 简单模式\n[2] 困难模式\n[0]离开");
        System.out.println("-----------------------");
        huantChoice = Input.input();
        switch (huantChoice) {
            case 1:
                hardHauntedHouse.play();
                System.out.println("恭喜您闯关成功！！");
                break;
            case 2:
                simpleHauntedHouse.play();
                System.out.println("恭喜您闯关成功！！");
                break;
            case 0:
                return;
            default:
                System.out.println("输入有误，请重新输入");
        }
    }
}
