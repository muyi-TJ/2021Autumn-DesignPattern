package JiyiCarnival.entertainment.movice.flyweight;

/**
 * @author ajt
 * 电影类的抽象接口
 */
public abstract class AbstractMovice {

    /**
     * 享元：电影名称
     */
    protected String name;

    /**
     * @param name 电影名称
     */
    public AbstractMovice(String name){
        this.name = name;
    }

    /**
     * 业务操作：在放映厅放电影
     * @param room 放映厅号
     */
    public abstract void play(String room);
}
