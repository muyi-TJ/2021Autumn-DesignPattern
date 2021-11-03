package JiyiCarnival.Processor;

import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.business.orderfood.command.*;
import JiyiCarnival.entertainment.animalshow.state.*;
import JiyiCarnival.entertainment.firework.bridge.FireworkControl;
import JiyiCarnival.entertainment.hotairballoon.adapter.HotAirBalloonAdapter;
import JiyiCarnival.entertainment.movice.flyweight.Movice;
import JiyiCarnival.entertainment.shooting.memento.ShootingUI;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.ChainOfResponsibility;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.Request;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.SlideHandler;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.visitor.Visitor;

import java.util.Formatter;

public class ZoneProcessor {
    private Visitor visitor = new Visitor();
    private Ticket ticket = new Ticket();
    private String[] names = {"寻梦环游记", "花木兰", "精灵旅社", "精灵旅社2"};
    public ZoneProcessor(){};
    public ZoneProcessor(Visitor visitor, Ticket ticket){
        this.ticket = ticket;
        this.visitor = visitor;
    }
    public void freeRoute() throws InterruptedException {
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
    public void excitingZone() throws InterruptedException {
        System.out.println("欢迎来到刺激专场");
        int choice = 1;
        while(choice>0){
            System.out.println("请选择项目：\n[1] 水上滑梯\n[2] 射击游戏\n[3] 鬼屋 \n[4] 退出分区\n");
            choice = Input.input();
            switch (choice){
                case 1:
                    SlideHandler slideChain = ChainOfResponsibility.getChainOfSlide(visitor);
                    Request request = new Request(4);
                    slideChain.handleVisitorRequest(request);
                    break;
                case 2:
                    ShootingUI shootingUI = new ShootingUI();
                    shootingUI.flowControl();
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
                    Cook cook = new Cook("KFC");
                    System.out.println("多种美味菜品、甜点、饮品尽在KFC！请问您需要点什么呢？");
                    Formatter formatter = new Formatter(System.out);
                    String []food=new String[]{"1.新奥尔良鸡腿堡","2.经典回归嫩牛五方","3.老北京鸭肉卷"};
                    String []dessert=new String[]{"1.蛋挞","2.红豆派","3.圣代"};
                    String []drink=new String[]{"1.可乐","2.橙汁","3.桃之恋乌龙茶"};
                    formatter.format("%-8s\t\t %-8s\t %-8s\n", "菜品","甜点","饮品");
                    for(int i=0;i<food.length;i++)
                        formatter.format("%-8s\t %-8s\t %-8s\n", food[i], dessert[i], drink[i]);
                    System.out.println("请选择一种菜品:");
                    int opt1=0,opt2=0,opt3=0;
                    opt1 = Input.input();
                    while(opt1<1||opt1>food.length){
                        System.out.println("输入错误，请重新输入");
                        opt1 = Input.input();
                    }


                    FoodOrder buyFoodOrder = new FoodOrder(cook, food[opt1-1]);

                    System.out.println("请选择一种甜点:");
                    opt2 = Input.input();
                    while(opt2<1||opt2>food.length){
                        System.out.println("输入错误，请重新输入");
                        opt2 = Input.input();
                    }
                    DessertOrder buyDessertOrder = new DessertOrder(cook, dessert[opt2-1]);

                    System.out.println("请选择一种饮品:");
                    opt3 = Input.input();
                    while(opt3<1||opt3>food.length){
                        System.out.println("输入错误，请重新输入");
                        opt3 = Input.input();
                    }
                    DrinkOrder buyDrinkOrder = new DrinkOrder(cook, drink[opt3-1]);
                    Waiter waiter = new Waiter();
                    waiter.setList(buyFoodOrder);
                    waiter.setList(buyDrinkOrder);
                    waiter.setList(buyDessertOrder);
                    waiter.visitorNotify();
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
                    HotAirBalloonAdapter hotAirBalloonAdapter = new HotAirBalloonAdapter();
                    hotAirBalloonAdapter.setVisitor(visitor);
                    hotAirBalloonAdapter.fly();
                    break;
                case 2:
                    break;
                case 3:
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
        System.out.println("欢迎来到好莱坞");
        int choice = 1;
        while(choice>0){
            System.out.println("请选择项目：\n[1] 电影\n[2] 动物表演\n[3] 舞台\n[4] 主题活动\n[5]退出分区\n");
            choice = Input.input();
            switch (choice){
                case 1:
                    Movice movice = new Movice(names);
                    movice.play(visitor);
                    break;
                case 2:
                    AnimalShowUI animalShowUI = new AnimalShowUI();
                    animalShowUI.flowControl();
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
