package JiyiCarnival.entertainment.shooting.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rounds-Chen
 * <p>
 * 备忘录负责人类
 * 一个负责人对象可以存储多个备忘录对象，根据下标检索到对应的备忘录
 */
public class RecordCaretaker
{
    private List<MementoIF> states = new ArrayList<>();
    private int index;

    /**
     * 添加游戏记录
     *
     * @param memento 新的游戏记录
     */
    public void saveRecord(MementoIF memento)
    {
        this.states.add(memento);
        this.index++;
    }

    /**
     * 检索某一游戏记录
     *
     * @param index 检索下标
     * @return 游戏记录
     */
    public MementoIF retriveRecord(int index)
    {
        return this.states.get(index);
    }

    /**
     * 移除某一游戏记录
     *
     * @param index 移除下标
     */
    public void removeRecord(int index)
    {
        this.states.remove(index);
        this.index--;
    }
}
