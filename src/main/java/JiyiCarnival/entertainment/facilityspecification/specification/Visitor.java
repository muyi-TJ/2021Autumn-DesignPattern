package JiyiCarnival.entertainment.facilityspecification.specification;

/**
 * @author swaychen0420
 * 记录游客姓名、年龄、身高、性别
 */

public class Visitor
{
    private int age;
    private String name;
    private double height;
    private Gender gender;

    public Visitor(String name)
    {
        this.name = name;
    }

    //获取游客姓名
    public String getName()
    {
        return name;
    }

    //设置游客姓名
    public Visitor setName(String name)
    {
        this.name = name;
        return this;
    }

    //获取游客年龄
    public int getAge()
    {
        return age;
    }

    //设置游客年龄
    public Visitor setAge(int age)
    {
        this.age = age;
        return this;
    }

    //获取游客身高
    public double getHeight()
    {
        return height;
    }

    //设置游客身高
    public Visitor setHeight(double height)
    {
        this.height = height;
        return this;
    }

    //获取游客性别
    public Gender getGender()
    {
        return gender;
    }

    //设置游客性别
    public Visitor setGender(Gender gender)
    {
        this.gender = gender;
        return this;
    }
}
