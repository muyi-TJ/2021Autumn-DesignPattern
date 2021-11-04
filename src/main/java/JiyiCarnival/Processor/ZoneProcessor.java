package JiyiCarnival.Processor;

import JiyiCarnival.base.broadcast.eventqueue.Broadcast;
import JiyiCarnival.base.broadcast.eventqueue.Message;
import JiyiCarnival.base.powerbank.proxy.Stuff;
import JiyiCarnival.base.restroom.prototype.ManRestroom;
import JiyiCarnival.base.restroom.prototype.Restroom;
import JiyiCarnival.base.restroom.prototype.WomanRestroom;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.business.orderfood.command.*;
import JiyiCarnival.business.souvenirshop.decorator.*;
import JiyiCarnival.entertainment.animalshow.state.*;
import JiyiCarnival.entertainment.carousel.composite.Axis;
import JiyiCarnival.entertainment.carousel.composite.Horse;
import JiyiCarnival.entertainment.facilityspecification.specification.Specification;
import JiyiCarnival.entertainment.facilityspecification.specification.VisitorAgeSpecification;
import JiyiCarnival.entertainment.facilityspecification.specification.VisitorHeightSpecification;
import JiyiCarnival.entertainment.firework.bridge.FireworkControl;
import JiyiCarnival.entertainment.hotairballoon.adapter.HotAirBalloonAdapter;
import JiyiCarnival.entertainment.movice.flyweight.Movice;
import JiyiCarnival.entertainment.parade.strategy.ParadeRoute;
import JiyiCarnival.entertainment.parade.strategy.ParadeUI;
import JiyiCarnival.entertainment.parade.strategy.RouteOne;
import JiyiCarnival.entertainment.shooting.memento.ShootingUI;
import JiyiCarnival.entertainment.stage.abstractfactory.StageUI;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.ChainOfResponsibility;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.Request;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.SlideHandler;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.visitor.Visitor;

import java.util.Formatter;

public class ZoneProcessor {
    private Visitor visitor = new Visitor();
    private final Broadcast broadcast = new Broadcast(1);
    private Ticket ticket = new Ticket();
    private String[] names = {"寻梦环游记", "花木兰", "精灵旅社", "精灵旅社2"};
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
                    System.out.println("欢迎来到水上滑梯大型游玩项目！\n");
                    System.out.println("为了您的人身安全，请在游玩前确保您已满足游玩条件：儿童年龄不得低于12岁，身高不得小于140cm。满足游玩条件后请前往售票处购票，祝您游玩愉快！\n");
                    System.out.println("游客规约检测loading……");
                    Specification<Visitor> specificationOne = (new VisitorAgeSpecification(12)).and(new VisitorHeightSpecification(140.0D));
                    if(specificationOne.isSatisfiedBy(visitor)){
                        SlideHandler slideChain = ChainOfResponsibility.getChainOfSlide(visitor);
                        Request request = new Request(4);
                        slideChain.handleVisitorRequest(request);
                    }
                    else{
                        System.out.println("非常抱歉，您并未满足游玩条件，可以选择游玩其他项目，祝您游玩愉快！");
                    }
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
        System.out.println("欢迎来到美食天堂!");
        int choice = 1;
        while(choice>0){
            System.out.println("-----------------------");
            System.out.println("请选择项目：\n[1] 餐厅\n[2] 小吃摊\n[3] 退出分区\n");
            System.out.println("-----------------------");
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
                    System.out.println("欢迎来到热气球大型游玩项目！\n");
                    System.out.println("为了您的人身安全，请在游玩前确保您已满足游玩条件：儿童年龄不得低于14岁，老人年龄不得大于60岁。满足游玩条件后请前往售票处购票，祝您游玩愉快！\n");
                    System.out.println("游客规约检测loading……");
                    Specification<Visitor> specificationOne = (new VisitorAgeSpecification(14)).and(new VisitorAgeSpecification(80).not());
                    if(specificationOne.isSatisfiedBy(visitor)){
                        HotAirBalloonAdapter hotAirBalloonAdapter = new HotAirBalloonAdapter();
                        hotAirBalloonAdapter.setVisitor(visitor);
                        hotAirBalloonAdapter.fly();
                    }
                    else{
                        System.out.println("非常抱歉，您并未满足游玩条件，可以选择游玩其他项目，祝您游玩愉快！");
                    }
                    break;
                case 2:
                    Axis axis = new Axis(1);
                    for (int i = 0; i < 3; i++) {
                        axis.add(new Horse(1));
                    }
                    axis.operate();
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
                    Movice movice = new Movice(names);
                    movice.play(visitor);
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
                    break;
                case 2:
                    System.out.println("请输入想租赁的充电宝数量：");
                    int num = Input.input();
                    Stuff stuff = new Stuff(1);
                    stuff.getPowerBank(num);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("欢迎您进入纪念品商店！DIY纪念挂饰正在热卖中，基础款为TONGJI字母挂饰，您可以选择自己喜欢的配件进行装饰！基础款15元，一个配件2元");
                    System.out.println("--------------");
                    System.out.println("1.白色椰壳 2.菩提果串珠 3.紫檀菱形雕 0.结束制作");
                    System.out.println("--------------");
                    BasicLogo basicLogo=new BasicLogo();
                    Ornament pointer=basicLogo;
                    int opt=1;
                    while(opt>0){
                        opt= Input.input();
                        switch(opt){
                            case 1:
                                pointer=new CircleDecorator(pointer);
                                break;
                            case 2:
                                pointer=new RectangleDecorator(pointer);
                                break;
                            case 3:
                                pointer=new DiamondDecorator(pointer);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("输入有误，请重新输入");
                                break;
                        }
                        System.out.println("ok");
                    }
                    System.out.println("挂饰制作好了^_^");
                    System.out.println(pointer.getPattern());
                    System.out.println("您一共消费："+pointer.cost()+"元，谢谢光临！");

                    break;
                case 5:
                    var normalOrigin=new Restroom();
                    var barrierFreeOrigin = new Restroom("无障碍卫生间");
                    var manOrigin = new ManRestroom();
                    var womanOrigin = new WomanRestroom();

                    var cloneNormalOrigin=normalOrigin.clone();
                    var cloneBarrierFreeOrigin = barrierFreeOrigin.clone();
                    var cloneManOrigin = manOrigin.clone();
                    var cloneWomanOrigin = womanOrigin.clone();

                    System.out.println("您来到了公共卫生间。");
                    System.out.println("您将进入：：\n[1] 男卫生科\n[2] 女卫生间\n[3] 无障碍卫生间\n[4] 亲子卫生间\n[0]离开公共卫生间\n");
                    choice = Input.input();
                    switch (choice) {
                        case 1:
                            cloneManOrigin.getType();
                            break;
                        case 2:
                            cloneWomanOrigin.getType();
                            break;
                        case 3:
                            cloneBarrierFreeOrigin.getType();
                            break;
                        case 4:
                            cloneNormalOrigin.getType();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("输入有误，请重新输入");
                            break;
                    }
                    
                case 6:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
}
