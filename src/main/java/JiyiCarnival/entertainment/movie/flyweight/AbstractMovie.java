package JiyiCarnival.entertainment.movie.flyweight;

import JiyiCarnival.util.visitor.Visitor;

import java.io.IOException;

/**
 * @author ajt
 * 电影类的抽象接口
 */
public abstract class AbstractMovie
{

    /**
     * 享元：电影名称
     */
    protected String name;
    protected String[] names;

    /**
     * @param name 电影名称
     */
    public AbstractMovie(String name)
    {
        this.name = name;
    }

    /**
     * @param names 电影名称列表
     */
    public AbstractMovie(String[] names){
        this.names = names;
    }

    /**
     * 业务操作：在放映厅放电影 测试模式
     *
     * @param room 放映厅号
     */
    public abstract void play(String room);


    /**
     * 业务操作：在放映厅放电影 游乐园模式
     * @param visitor 游客
     */
    public abstract void play(Visitor visitor) throws InterruptedException, IOException;
}
