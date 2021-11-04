package JiyiCarnival.Processor;

import JiyiCarnival.base.bikes.mediator.BikesUI;
import JiyiCarnival.base.broadcast.eventqueue.Broadcast;
import JiyiCarnival.base.broadcast.eventqueue.Message;
import JiyiCarnival.base.bulletinboard.blackboard.BulletinBoardControl;
import JiyiCarnival.base.powerbank.proxy.PowerBankControl;
import JiyiCarnival.base.powerbank.proxy.Stuff;
import JiyiCarnival.base.restroom.prototype.RestroomUI;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.business.foodstand.factory.SnackBlockUI;
import JiyiCarnival.business.orderfood.command.*;
import JiyiCarnival.business.souvenirshop.decorator.*;
import JiyiCarnival.entertainment.activate.template.ActivityUI;
import JiyiCarnival.entertainment.animalshow.state.*;
import JiyiCarnival.entertainment.carousel.composite.HorseControl;
import JiyiCarnival.entertainment.firework.bridge.FireworkControl;
import JiyiCarnival.entertainment.hauntedhouse.builder.HauntedHouseUI;
import JiyiCarnival.entertainment.hotairballoon.adapter.HotAirBalloonControl;
import JiyiCarnival.entertainment.movice.flyweight.MovieControl;
import JiyiCarnival.entertainment.parade.strategy.ParadeUI;
import JiyiCarnival.entertainment.shooting.memento.ShootingUI;
import JiyiCarnival.entertainment.stage.abstractfactory.StageUI;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.WaterSlideControl;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.visitor.Visitor;

public class ZoneProcessor {
    private Visitor visitor = new Visitor();
    private final Broadcast broadcast = new Broadcast(1);
    private Ticket ticket = new Ticket();
    public ZoneProcessor(){};
    public ZoneProcessor(Visitor visitor, Ticket ticket){
        this.ticket = ticket;
        this.visitor = visitor;
    }
    public void freeRoute() throws InterruptedException {
        int choice = 1;
        broadcast.init();
        broadcast.addMessage(new Message("欢迎来到济忆嘉年华！"));
        Thread.sleep(500);
        broadcast.stop();
        while(choice>0) {
            System.out.println("-----------------------");
            System.out.println("请选择嘉年华分区：\n[1] 刺激专场\n[2] 美食天堂\n[3] 幻想世界 \n[4] 好莱坞\n[5] 辅助设施\n[0] 退出");
            System.out.println("-----------------------");
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
    public void excitingZone() throws InterruptedException {
        System.out.println("欢迎来到刺激专场!");
        int choice = 1;
        while(choice>0){
            System.out.println("-----------------------");
            System.out.println("请选择项目：\n[1] 水上滑梯\n[2] 射击游戏\n[3] 鬼屋 \n[4] 退出分区\n");
            System.out.println("-----------------------");
            choice = Input.input();
            switch (choice){
                case 1:
                    WaterSlideControl waterSlideControl = new WaterSlideControl();
                    waterSlideControl.flowControl();
                    break;
                case 2:
                    ShootingUI shootingUI = new ShootingUI();
                    shootingUI.flowControl();
                    break;
                case 3:
                    HauntedHouseUI hauntedHouseUI = new HauntedHouseUI();
                    hauntedHouseUI.flowControl();
                    break;
                case 4:

                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }

    }
    public void foodParadise() throws InterruptedException {
        System.out.println("欢迎来到美食天堂!");
        int choice = 1;
        while(choice>0){
            System.out.println("-----------------------");
            System.out.println("请选择项目：\n[1] 餐厅\n[2] 小吃摊\n[3] 退出分区\n");
            System.out.println("-----------------------");
            choice = Input.input();
            switch (choice){
                case 1:
                    RestaurantUI restaurantUI = new RestaurantUI();
                    restaurantUI.flowControl();
                    break;
                case 2:
                    SnackBlockUI snackBlockUI = new SnackBlockUI();
                    snackBlockUI.flowControl();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
    public void fantasyWorld() throws InterruptedException {
        System.out.println("欢迎来到幻想世界!");
        int choice = 1;
        while(choice>0){
            System.out.println("-----------------------");
            System.out.println("请选择项目：\n[1] 热气球\n[2] 旋转木马\n[3] 花车\n[4] 烟花表演 \n[5] 退出分区\n");
            System.out.println("-----------------------");
            choice = Input.input();
            switch (choice){
                case 1:
                    HotAirBalloonControl hotAirBalloonControl = new HotAirBalloonControl();
                    hotAirBalloonControl.flowControl();
                    break;
                case 2:
                    HorseControl horseControl = new HorseControl();
                    horseControl.flowControl();
                    break;
                case 3:
                    ParadeUI paradeUI = new ParadeUI();
                    paradeUI.flowControl();
                    break;
                case 4:
                    FireworkControl fireworkControl = new FireworkControl();
                    fireworkControl.flowControl();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
    public void hollywood() throws InterruptedException {
        System.out.println("欢迎来到好莱坞!");
        int choice = 1;
        while(choice>0){
            System.out.println("-----------------------");
            System.out.println("请选择项目：\n[1] 电影\n[2] 动物表演\n[3] 舞台演出\n[4] 主题活动\n[5] 退出分区\n");
            System.out.println("-----------------------");
            choice = Input.input();
            switch (choice){
                case 1:
                    MovieControl movieControl = new MovieControl();
                    movieControl.flowControl();
                    break;
                case 2:
                    AnimalShowUI animalShowUI = new AnimalShowUI();
                    animalShowUI.flowControl();
                    break;
                case 3:
                    StageUI stageUI = new StageUI();
                    stageUI.flowControl();
                    break;
                case 4:
                    ActivityUI activityUI = new ActivityUI();
                    activityUI.flowControl();
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
            System.out.println("-----------------------");
            System.out.println("请选择项目：\n[1] 单车\n[2] 充电宝\n[3] 公告栏\n[4] 纪念品商店\n[5] 洗手间\n[6]退出分区\n");
            System.out.println("-----------------------");
            choice = Input.input();
            switch (choice){
                case 1:
                    BikesUI bikesUI = new BikesUI();
                    bikesUI.flowControl();
                    break;
                case 2:
                    PowerBankControl powerBankControl = new PowerBankControl();
                    powerBankControl.flowControl();
                    break;
                case 3:
                    BulletinBoardControl bulletinBoardControl = new BulletinBoardControl();
                    bulletinBoardControl.flowControl();
                    break;
                case 4:
                    ShopUI shopUI = new ShopUI();
                    shopUI.flowControl();
                    break;
                case 5:
                    RestroomUI restroomUI = new RestroomUI();
                    restroomUI.flowControl();
                case 6:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
}
