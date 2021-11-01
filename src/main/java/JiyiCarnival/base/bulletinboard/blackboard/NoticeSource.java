package JiyiCarnival.base.bulletinboard.blackboard;
/**
 *@author Caviar011230
 * 消息源类
 */
public class NoticeSource {
    Blackboard blackboard;
    String notice;

    /**
     * 初始化消息源类对象
     * @param blackboard 对应黑板类对象
     * @param notice 消息源内容
     */
    public NoticeSource(Blackboard blackboard,String notice){
        this.blackboard = blackboard;
        this.notice = notice;
    }

    /**
     * 将消息源内容置入黑板类对象
     */
    public void updateBlackboard(){
        blackboard.update(notice);
    }
}
