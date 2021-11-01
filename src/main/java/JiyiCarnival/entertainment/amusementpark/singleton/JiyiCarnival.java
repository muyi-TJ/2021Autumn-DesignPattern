package JiyiCarnival.entertainment.amusementpark.singleton;

import JiyiCarnival.Output;

/**
 * @author muyi
 * 济忆嘉年华本身
 */
public class JiyiCarnival
{
    private static JiyiCarnival instance = new JiyiCarnival();

    /**
     * 提供私有的构造函数，使其不会被实例化
     */
    private JiyiCarnival()
    {

    }

    /**
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
        Output.output(this.getClass().toString(),
                "getInfo",
                String.valueOf(System.identityHashCode(this)),
                "当前的游乐园是：" + this.toString()
        );
    }


}
