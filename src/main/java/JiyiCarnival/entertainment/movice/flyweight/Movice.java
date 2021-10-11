package JiyiCarnival.entertainment.movice.flyweight;

/**
 * @author ajt
 * 具体的电影类
 */
public class Movice extends AbstractMovice {

    /**
     * 电影构造器
     * @param name 电影名称
     */
    public Movice(String name){
        super(name);
    }

    /**
     * 设置改电影的放映厅号
     * @param room 放映厅号
     */
    @Override
    public void play(String room) {
        System.out.println(room + "号放映厅正在播放" + this.name);
    }
}
