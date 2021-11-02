package JiyiCarnival.util.visitor;

import JiyiCarnival.base.ticketing.converter.Converter;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.base.ticketing.converter.VisitorConverter;
import JiyiCarnival.util.input.Input;

import java.util.Scanner;

/**
 * @author WAKTZZL
 * 创建游客
 */
public class VisitorCreator {
    private  Ticket ticket;
    private  Visitor visitor = new Visitor();

    /**
     * 创建游客以及门票
     * @return 返回游客
     * @throws InterruptedException 使用了线程睡眠函数
     */
    public Visitor create() throws InterruptedException {
        int error = 1;
        System.out.println("请输入您的身份信息：");
        while(error != 0) {
            System.out.print("请输入您的名字：");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            System.out.print("请选择您的性别：[1]男 [2]女：");
            int gender_num = Input.input();
            while (gender_num != 1 && gender_num != 2) {
                System.out.print("性别输入有误，请重新输入：");
                gender_num = Input.input();
            }
            Gender gender = gender_num == 1 ? Gender.MALE : Gender.FEMALE;
            System.out.print("请输入您的年龄：");
            int age = Input.input();
            while (age < 0 || age > 100) {
                System.out.print("年龄输入有误，请重新输入：");
                age = Input.input();
            }
            System.out.print("请输入您的身高（cm）：");
            int height = Input.input();
            while (height < 60 || height > 200) {
                System.out.print("身高输入有误，请重新输入：");
                height = Input.input();
            }
            System.out.print("请输入您的ID：");
            String ID = scan.nextLine();
            visitor.setName(name);
            visitor.setAge(age);
            visitor.setGender(gender);
            visitor.setID(ID);
            visitor.setHeight(height);
            System.out.println("请检查您的个人信息是否有误：[0] 正确 [1] 有误");
            int check = Input.input();
            while(check < 0 || check > 1){
                System.out.println("输入有误，请重新输入：");
                check = Input.input();
            }
            if(check == 0)
                error = 0;
            else{
                System.out.println("请重新输入您的个人信息！");
            }
        }
        System.out.println("正在出票，请稍后");
        for(int i=0; i<6; i++){
            System.out.print('.');
            Thread.sleep(500);
        }
        System.out.println("\n" + visitor.getName() + "，恭喜您，购票成功");
        System.out.println("请查看您的门票信息");
        Converter<Ticket, Visitor> converter = new VisitorConverter();
        ticket = converter.entity2dto(visitor);
        ticket.printInfomation();
        System.out.println("两秒后您将返回游玩路线菜单！");
        Thread.sleep(2000);
        return visitor;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
