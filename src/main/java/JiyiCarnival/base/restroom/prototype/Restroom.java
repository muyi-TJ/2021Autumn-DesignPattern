package JiyiCarnival.base.restroom.prototype;


import JiyiCarnival.Output;

/**
 * @author muyi
 * 卫生间
 */
public class Restroom implements Cloneable
{
    protected String type = "亲子卫生间";

    /**
     * @param type 卫生间类型
     */
    public Restroom(String type)
    {
        this.type = type;
    }

    /**
     * 无参构造函数
     */
    public Restroom(){};

    /**
     * 输出卫生间类型
     */
    public void getTypeLog()
    {
        Output.output(this.getClass().toString(),
                "getType",
                String.valueOf(System.identityHashCode(this)),
                type
        );
//        System.out.println("您进入了"+type+"。");
//        try{
//            Thread.sleep(200);
//        }catch (InterruptedException ex)
//        {
//            System.out.println("出现异常");
//        }
//        System.out.println("您离开了"+type+"。");
    }
    public void getType()
    {
//        Output.output(this.getClass().toString(),
//                "getType",
//                String.valueOf(System.identityHashCode(this)),
//                type
//        );
        System.out.println("您进入了"+type+"。");
        try{
            Thread.sleep(200);
        }catch (InterruptedException ex)
        {
            System.out.println("出现异常");
        }
        System.out.println("您离开了"+type+"。");
    }

    @Override
    public Restroom clone()
    {
        Restroom obj = null;
        try
        {
            obj = (Restroom) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return obj;
    }


}
