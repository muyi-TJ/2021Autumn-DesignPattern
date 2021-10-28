package JiyiCarnival.base.bulletinboard.blackboard;
/**
 *@author Caviar011230
 * 消息源类
 */
public class NoticeSource {
    Blackboard blackboard;
    String notice;
    /*
    * 初始化消息源类对象
     */
    public NoticeSource(Blackboard blackboard,String notice){
        this.blackboard = blackboard;
        this.notice = notice;
    }
    public void updateBlackboard(){
        blackboard.update(notice);
    }
}
