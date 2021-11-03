package JiyiCarnival.Processor;

import JiyiCarnival.util.input.Input;

public class ZoneProcessor {
    public void freeRoute(){
        int choice = 1;
        while(choice>0) {
            System.out.println("请选择嘉年华分区：\n[1] 刺激专场\n[2] 美食天堂\n[3] 幻想世界 \n[4] 好莱坞\n[5] 辅助设施\n[0] 退出");
            choice = Input.input();
            switch (choice){
                case 1:
                    excitingZone();
                    break;
                case 2:
                    foodParadise();
                    break;
                case 3:
                    fantasyWorld();
                    break;
                case 4:
                    hollywood();
                    break;
                case 5:
                    auxiliary();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }
    public void excitingZone(){
        System.out.println("欢迎来到刺激专场");
        int choice = 1;
        while(choice>0){
            System.out.println("请选择项目：\n[1] 水上滑梯\n[2] 射击游戏\n[3] 鬼屋 \n[4] 退出分区\n");
            choice = Input.input();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }

    }
    public void foodParadise(){
        System.out.println("欢迎来到美食天堂");
        int choice = 1;
        while(choice>0){
            System.out.println("请选择项目：\n[1] 餐厅\n[2] 小吃摊\n[3] 退出分区\n");
            choice = Input.input();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
    public void fantasyWorld(){
        System.out.println("欢迎来到幻想世界");
        int choice = 1;
        while(choice>0){
            System.out.println("请选择项目：\n[1] 热气球\n[2] 旋转木马\n[3] 花车\n[4] 烟花表演 \n[5] 退出分区\n");
            choice = Input.input();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
    public void hollywood(){
        System.out.println("欢迎来到好莱坞");
        int choice = 1;
        while(choice>0){
            System.out.println("请选择项目：\n[1] 电影\n[2] 动物表演\n[3] 舞台\n[4] 主题活动\n[5]退出分区\n");
            choice = Input.input();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
    public void auxiliary(){
        int choice = 1;
        while(choice>0){
            System.out.println("请选择项目：\n[1] 单车\n[2] 充电宝\n[3] 公告栏\n[4] 纪念品商店\n[5]退出分区\n");
            choice = Input.input();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
}
