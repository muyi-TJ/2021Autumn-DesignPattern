package JiyiCarnival.entertainment.shooting.memento;

/**
 * @author Rounds-Chen
 *
 * 备忘录对象发起人类，定义了射击游戏玩家的昵称和分数
 */
public class RecordOriginator {
    private String nickName;
    private Integer score;

    public String getNickName() {
        return nickName;
    }
    public Integer getScore() {
        return score;
    }

    public void setRecord(String nickName,Integer score) {
        this.nickName = nickName;
        this.score=score;
    }

    public void printCurrentRecord(){
        System.out.println("\t玩家昵称："+nickName);
        System.out.format("\t玩家得分：%d\n\n",score);
    }


    /**
     * 创建一个备忘录对象
     * @return 备忘录接口对象
     */
    public MementoIF createMemento(){
        return new Memento(nickName,score);
    }

    /**
     * 恢复到指定备忘录状态
     * @param memento 指定的备忘录对象
     */
    public void restoreMemento(MementoIF memento){
        this.setRecord(((Memento)memento).getNickName(),((Memento)memento).getScore());
    }

    private class Memento implements MementoIF{
        private String nickName;
        private Integer score;

        /**
         * 构造函数
         * @param nickName 记录的玩家昵称
         * @param score 记录的玩家分数
         */
        public Memento(String nickName, Integer score) {
            this.nickName = nickName;
            this.score = score;
        }

        public String getNickName() {
            return nickName;
        }

        public Integer getScore() {
            return score;
        }
    }
}
