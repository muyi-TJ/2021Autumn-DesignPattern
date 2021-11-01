package JiyiCarnival.base.parkinglot.observe;

import java.util.Vector;

/**
 * @author PinkCrow007
 * 目标类（抽象）
 */
public class Subject
{
    /**
     * 观察者列表
     */
    protected Vector<Observer> ObserverList = new Vector<>();

    /**
     * 添加观察者到 ObserverList 中
     *
     * @param observer 观察者
     */
    public void addObserver(Observer observer)
    {
        this.ObserverList.add(observer);
    }

    /**
     * 通知各个观察者，使它们更新
     *
     * @param flg 标记驶入或驶出
     */
    public void notifyObserver(boolean flg)
    {
        for (Observer observer : this.ObserverList)
        {
            observer.update(flg);
        }
    }
}
