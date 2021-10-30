package JiyiCarnival.base.ticketing.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author WKATZZL
 * 门票类
 */

public class Ticket {
    /**
     * 游客的姓名 身份证号 年龄 性别
     * 门票的开票时间
     */
    private String name;
    private String ID;
    private int age;
    private String gender;
    private Date date = new Date();


    /**
     * 构造函数
     * 什么都不需要做
     */
    public Ticket(){}

    /**
     * 构造函数
     * @param name 游客姓名
     * @param ID 游客身份证号
     * @param age 游客年龄
     * @param gender 游客性别
     */
    public Ticket(String name, String ID, int age, String gender){
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
        date = new Date();
    }

    /**
     * 获取游客姓名
     * @return 游客姓名
     */
    public String getName(){
        return name;
    }

    /**
     * 获取游客身份证号
     * @return 返回游客身份证号
     */
    public String getID(){
        return ID;
    }

    /**
     * 获取游客年龄
     * @return 返回游客年龄
     */
    public int getAge(){
        return age;
    }

    /**
     * 获取游客性别
     * @return 返回游客性别
     */
    public String getGender(){
        return gender;
    }

    /**
     * 获取入园时间
     * @return 返回入园时间
     */
    public Date getDate(){
        return date;
    }


    /**
     * 设置游客姓名
     * @param name 游客姓名
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * 设置游客身份证号
     * @param ID 游客身份证号
     */
    public void setID(String ID){
        this.ID = ID;
    }

    /**
     * 设置游客年龄
     * @param age 游客年龄
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * 设置游客性别
     * @param gender 游客性别
     */
    public void setGender(String gender){
        this.gender = gender;
    }

    /**
     * 设置入园时间
     * @param date 入园时间
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * 打印票务信息
     */
    public void printInfomation(){
        System.out.println("------------------------");
        System.out.println("门票信息：");
        System.out.println("游客姓名：" + name);
        System.out.println("身份证号：" + ID);
        System.out.println("游客年龄：" + age + "岁");
        System.out.println("游客性别：" + gender);
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        System.out.println("入园时间：" + dateFormat.format(date));
        System.out.println("------------------------");
    }


}
