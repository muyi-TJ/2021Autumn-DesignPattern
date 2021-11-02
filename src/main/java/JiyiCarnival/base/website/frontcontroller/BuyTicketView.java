package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;
import JiyiCarnival.base.ticketing.converter.Converter;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.base.ticketing.converter.VisitorConverter;
import JiyiCarnival.util.visitor.Gender;
import JiyiCarnival.util.visitor.Visitor;
import JiyiCarnival.util.input.Input;

import java.util.Scanner;

/**
 * @author Zong
 * 创建购票视图类
 */
public class BuyTicketView
{
    /**
     * 展示购票视图 测试模式
     */
    public void show()
    {
        String text = "在这里购买门票，即可凭票入园！";
        Output.output(
                this.getClass().toString(),
                "show",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 购票视图 游乐园模式
     * @return 购票的游客
     * @throws InterruptedException 使用了线程的睡眠函数
     */
    public Visitor view() throws InterruptedException {
        int error = 1;
        Visitor visitor = new Visitor();
        System.out.println("购买门票，即可凭票入园！");
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
            System.out.print("请输入您的ID：");
            String ID = scan.nextLine();
            visitor.setName(name);
            visitor.setAge(age);
            visitor.setGender(gender);
            visitor.setID(ID);
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
        Ticket ticket = converter.entity2dto(visitor);
        ticket.printInfomation();
        return visitor;
    }
}