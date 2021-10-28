package JiyiCarnival.base.bulletinboard.blackboard;

import java.util.ArrayList;

/**
 *@author Caviar011230
 * 控制类
 */
public class Control {
    ArrayList<NoticeSource> noticeSources;
    Blackboard blackboard;
    public Control(Blackboard blackboard){
        noticeSources = new ArrayList<>();
        this.blackboard = blackboard;
    }
    public void loop(){
        for(NoticeSource noticeSource:noticeSources){
            noticeSource.updateBlackboard();
        }
        this.noticeSources = new ArrayList<>();
    }
    public void nextSource(String notice){
        NoticeSource tempSource = new NoticeSource(blackboard,notice);
        noticeSources.add(tempSource);
    }

}
