package JiyiCarnival.base.bulletinboard.blackboard;

import java.util.ArrayList;

/**
 *@author Caviar011230
 * 控制类
 */
public class Control {
    ArrayList<NoticeSource> noticeSources;
    Blackboard blackboard;

    /**
     * 构造函数
     * @param blackboard 黑板类对象
     */
    public Control(Blackboard blackboard){
        noticeSources = new ArrayList<>();
        this.blackboard = blackboard;
    }

    /**
     * 将消息源的内容全部放入黑板类后，清空消息源列表
     */
    public void loop(){
        for(NoticeSource noticeSource:noticeSources){
            noticeSource.updateBlackboard();
        }
        this.noticeSources = new ArrayList<>();
    }

    /**
     * 添加新消息源
     * @param notice 新消息源的内容
     */
    public void nextSource(String notice){
        NoticeSource tempSource = new NoticeSource(blackboard,notice);
        noticeSources.add(tempSource);
    }

}
