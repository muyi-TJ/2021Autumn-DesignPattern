package JiyiCarnival.entertainment.amusementpark.singleton;

/**
 * @author muyi
 *
 * 济忆嘉年华本身
 */
public class JiyiCarnival
{
    private static JiyiCarnival instance=new JiyiCarnival();

    /**
     * 提供私有的构造函数，使其不会被实例化
     */
    private JiyiCarnival()
    {

    }

    /**
     *
     * @return 单例实体
     */
    public static JiyiCarnival getInstance()
    {
        return instance;
    }

    /**
     * 显示信息函数
     */
    public void getInfo()
    {
        System.out.println("当前的游乐园是："+this.toString());
    }


}
