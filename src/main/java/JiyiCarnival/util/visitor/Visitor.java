package JiyiCarnival.util.visitor;


/**
 * @author WKATZZL
 * 游客类
 */
public class Visitor
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
    public String getGender()
    {
        return gender.toString();
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

}
