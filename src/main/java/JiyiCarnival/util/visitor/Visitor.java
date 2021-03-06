package JiyiCarnival.util.visitor;


import JiyiCarnival.Output;
import JiyiCarnival.entertainment.hotairballoon.adapter.Walkable;

import java.text.SimpleDateFormat;

/**
 * @author WKATZZL
 * 游客类
 */
public class Visitor implements Walkable
{

    /**
     * 游客的属性
     * 姓名 身份证号 年龄 性别
     */
    private String name;
    private String ID;
    private int age;
    private Gender gender;
    private int height;

    /**
     * 构造函数
     * 什么都不需要做
     */
    public Visitor() {}

    /**
     * 构造函数
     *
     * @param name   游客姓名
     * @param ID     游客身份证号
     * @param age    游客年龄
     * @param gender 游客性别
     */
    public Visitor(String name, String ID, int age, Gender gender, int height)
    {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public Visitor(String name) {
        this.name = name;
    }

    /**
     * 获取游客姓名
     *
     * @return 游客姓名
     */
    public String getName()
    {
        return name;
    }

    /**
     * 设置游客姓名
     * @param name 游客姓名
     * @return 返回游客对象
     */
    public Visitor setName(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * 获取游客身份证号
     *
     * @return 返回游客身份证号
     */
    public String getID()
    {
        return ID;
    }

    /**
     * 设置游客身份证号
     * @param ID 游客身份证号
     * 返回游客对象
     */
    public Visitor setID(String ID)
    {
        this.ID = ID;
        return this;
    }

    /**
     * 获取游客年龄
     *
     * @return 返回游客年龄
     */
    public int getAge()
    {
        return age;
    }

    /**
     * 设置游客年龄
     * @param age 游客年龄
     * @return 游客对象
     */
    public Visitor setAge(int age)
    {
        this.age = age;
        return this;
    }

    /**
     * 获取游客性别
     *
     * @return 返回游客性别
     */
    public Gender getGender()
    {
        return gender;
    }

    /**
     * 获得游客身高
     * @return 游客身高
     */
    public int getHeight(){return this.height;}

    /**
     * 设置游客身高
     * @param height 游客身高
     * @return 游客对象
     */
    public Visitor setHeight(int height){
        this.height = height;
        return this;
    }


    /**
     * 设置游客性别
     * @param gender 游客性别
     * @return 返回游客对象
     */
    public Visitor setGender(Gender gender)
    {
        this.gender = gender;
        return this;
    }


    /**
     * 打印游客信息 测试模式
     */
    public void logInfomation()
    {
        String visitorInfo = """
                                
                ------------------------
                游客信息：
                游客姓名：%s
                身份证号：%s
                游客年龄：%d
                游客性别：%s
                游客身高：%d
                ------------------------
                """;
        visitorInfo = String.format(visitorInfo, name, ID, age, gender.toString(), height);
        Output.output(this.getClass().toString(),
                "logInformation",
                String.valueOf(System.identityHashCode(this)),
                visitorInfo
        );
    }

    /**
     * 打印游客信息 游乐园模式
     */
    public void printInfomation()
    {
        String visitorInfo = """
                                
                ------------------------
                游客信息：
                游客姓名：%s
                身份证号：%s
                游客年龄：%d
                游客性别：%s
                游客身高：%d
                ------------------------
                """;
        visitorInfo = String.format(visitorInfo, name, ID, age, gender.toString(), height);
        System.out.println(visitorInfo);
    }

    /**
     * 游客行走输出 测试模式
     */
    @Override
    public void walkLog(){
        Output.output(
                this.getClass().toString(),
                "fly",
                String.valueOf(System.identityHashCode(this)),
                "游客在陆地行走"
        );
    }

    /**
     * 游客行走输出 游乐园模式
     */
    @Override
    public void walk() {
        System.out.println("游客行走");
    }
}
