package JiyiCarnival.base.ticketing.converter;

/**
 * @author WKATZZL
 * 游客类
 */
public class Visitor {
    /**
     * 游客的属性
     * 姓名 身份证号 年龄 性别
     */
    private String name;
    private String ID;
    private int age;
    private String gender;

    /**
     * 构造函数
     * 什么都不需要做
     */
    public Visitor(){}

    /**
     * 构造函数
     * @param name 游客姓名
     * @param ID 游客身份证号
     * @param age 游客年龄
     * @param gender 游客性别
     */
    public Visitor(String name, String ID, int age, String gender){
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
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
     * 打印游客信息
     */
    public void printInfomation(){
        System.out.println("------------------------");
        System.out.println("游客信息：");
        System.out.println("游客姓名：" + name);
        System.out.println("身份证号：" + ID);
        System.out.println("游客年龄：" + age + "岁");
        System.out.println("游客性别：" + gender);
        System.out.println("------------------------");
    }
}
