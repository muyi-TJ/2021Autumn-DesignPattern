package JiyiCarnival.entertainment.stage.abstractfactory;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.office.staffinfo.nullobject.AbstractStaff;
import JiyiCarnival.office.staffinfo.nullobject.StaffFactory;
import JiyiCarnival.util.input.Input;

import java.util.Scanner;

/**
 * @author WKATZZL
 * 舞台UI类
 */
public class StageUI {
    /**
     * 舞台演出
     * @throws InterruptedException 线程睡眠
     */
    public void stageShow() throws InterruptedException {
        System.out.println("尊敬的" + JiyiCarnival.getVisitor().getName() + "请坐好，演出马上开始！");
        for(int i=0; i<4; i++){
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.print("\n");
        System.out.println("有请演员登场~~~~~~~");
        System.out.println("演出开始啦！");
        String[] lightings = {"Laser", "MovingHead", "TracingLamp"};
        String[] items = {"ColouredRibbon", "Sprinkler", "StageFog"};
        boolean[] lFlags = {false, false, false};
        boolean[] iFlags = {false, false, false};
        AbstractFactory lighting= FactoryProducer.getFactory("Lighting");
        AbstractFactory item=FactoryProducer.getFactory("Item");
        for(int i=0; i<2;){
            int index = (int)(Math.random() * 3);
            if(lFlags[index])
                continue;
            else{
                lighting.getLighting(lightings[index]).turnOnPrint();
                lFlags[index] = false;
                i++;
            }
        }

        for(int i=0; i<2;){
            int index = (int)(Math.random() * 3);
            if(iFlags[index])
                continue;
            else{
                item.getItem(items[index]).useItemPrint();
                iFlags[index] = false;
                i++;
            }
        }

    }

    /**
     * 展示工作人员
     */
    public void staffShow() throws InterruptedException {
        System.out.println("当前舞台工作人员有：");
        System.out.println("doinb, junjia, chovy, 余霜");
        System.out.println("请输入您要查询的工作人员名字，退出请输入QUIT");
        Scanner scan = new Scanner(System.in);
        String staffName = scan.next();
        while(!staffName.equals("QUIT")){
            AbstractStaff staff = StaffFactory.getStaff(staffName);
            staff.infoPrint();
            Thread.sleep(500);
            System.out.println("请输入您要查询的工作人员名字，退出请输入QUIT");
            staffName = scan.next();
        }

    }



    /**
     * 流程控制
     */
    public void flowControl() throws InterruptedException {
        System.out.println("欢迎来到因你最美舞台演出！");
        int choice = 4;
        while(choice>0) {
            System.out.println("请选择：\n[1] 观看舞台演出\n[2] 查看人员信息\n[3] 离开");
            choice = Input.input();
            switch (choice){
                case 1:
                    stageShow();
                    break;
                case 2:
                    staffShow();
                    break;
                case 3:
                    System.out.println("祝您观演愉快！再见！");
                    choice = 0;
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }

    }
}
