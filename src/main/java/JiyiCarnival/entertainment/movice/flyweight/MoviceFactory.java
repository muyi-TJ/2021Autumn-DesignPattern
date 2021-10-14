package JiyiCarnival.entertainment.movice.flyweight;

import java.util.HashMap;

/**
 * @author ajt
 * 实现FlyWeight所必需的特殊工厂类。该类仅在生产每个类别的第一个实例时调用构造函数，其余全部返回引用
 */
public class MoviceFactory {
    private static final HashMap<String, Movice> pool = new HashMap<String, Movice>();

    /**
     * 根据电影名称获取对应的电影对象
     * 如果该电影已被实例化过，则返回其引用
     * 否则添加一个新的电影
     * @param name 电影名称
     * @return 电影
     */
    public static Movice getMovice(String name){
        Movice movice = (Movice) pool.get(name);
        if (movice == null){
            movice = new Movice(name);
            pool.put(name, movice);

            System.out.println("新增电影: " + name);
        }
        return pool.get(name);
    }
}
