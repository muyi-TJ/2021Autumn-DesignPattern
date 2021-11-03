package JiyiCarnival.entertainment.shooting.memento;

import JiyiCarnival.Output;

/**
 * @author Rounds-Chen
 * <p>
 * 备忘录对象发起人类，定义了射击游戏玩家的昵称和分数
 */
public class RecordOriginator
{
    private String nickName;
    private Integer score;

    public String getNickName()
    {
        return nickName;
    }

    public Integer getScore()
    {
        return score;
    }

    /**
     * 设置当前玩家昵称和分数
     *
     * @param nickName 玩家昵称
     * @param score    得分
     */
    public void setRecord(String nickName, Integer score)
    {
        this.nickName = nickName;
        this.score = score;
    }

    /**
     * 打印信息
     */
    public void printCurrentRecord()
    {
        Output.output(
                this.getClass().toString(),
                "printCurrentRecord",
                String.valueOf(System.identityHashCode(this)),
                "\t玩家昵称：" + nickName + "\t玩家得分：" + score
        );
//        System.out.println("\t玩家昵称："+nickName);
//        System.out.format("\t玩家得分：%d\n\n",score);
    }


    /**
     * 创建一个备忘录对象
     *
     * @return 备忘录接口对象
     */
    public MementoIF createMemento()
    {
        return new Memento(nickName, score);
    }

    /**
     * 恢复到指定备忘录状态
     *
     * @param memento 指定的备忘录对象
     */
    public void restoreMemento(MementoIF memento)
    {
        this.setRecord(((Memento) memento).getNickName(), ((Memento) memento).getScore());
    }

    private class Memento implements MementoIF
    {
        private String nickName;
        private Integer score;

        /**
         * 构造函数
         *
         * @param nickName 记录的玩家昵称
         * @param score    记录的玩家分数
         */
        public Memento(String nickName, Integer score)
        {
            this.nickName = nickName;
            this.score = score;
        }

        public String getNickName()
        {
            return nickName;
        }

        public Integer getScore()
        {
            return score;
        }

        public void print(){
            System.out.println(nickName + "   " + score + "分");
        }
    }
}
