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
     * 输出卫生间类型
     */
    public void getType()
    {
        Output.output(this.getClass().toString(),
                "getType",
                String.valueOf(System.identityHashCode(this)),
                type
        );
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
