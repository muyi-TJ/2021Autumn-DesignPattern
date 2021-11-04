package JiyiCarnival.business.orderfood.command;

import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.input.Input;

import java.util.Formatter;

/**
 * @author WKATZZL
 * 餐厅UI界面
 */
public class RestaurantUI extends Controller {
    /**
     * 餐厅流程控制
     */
    public void flowControl() throws InterruptedException {
        Cook cook = new Cook("KFC");
        System.out.println("多种美味菜品、甜点、饮品尽在KFC！请问您需要点什么呢？");
        Formatter formatter = new Formatter(System.out);
        String []food=new String[]{"1.新奥尔良鸡腿堡🍔", "2.经典回归嫩牛五方🥩", "3.老北京鸭肉卷🌮"};
        String []dessert=new String[]{"1.蛋挞🥚", "2.红豆派🥧", "\t3.奥利奥圣代🍨"};
        String []drink=new String[]{"1.可乐🥤","2.橙汁🧃","3.桃之恋乌龙茶🍵"};
        formatter.format("%-12s\t\t %-12s\t %-12s\n", "菜品","甜点","饮品");
        for(int i=0;i<food.length;i++)
            formatter.format("%-12s\t %-12s\t %-12s\n", food[i], dessert[i], drink[i]);
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
    }
}
