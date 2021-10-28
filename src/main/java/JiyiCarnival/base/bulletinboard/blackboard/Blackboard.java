package JiyiCarnival.base.bulletinboard.blackboard;

import java.util.ArrayList;

/**
 *@author Caviar011230
 * 黑板类
 */
public class Blackboard {
    ArrayList<String> noticeList;
    public Blackboard(){
        noticeList = new ArrayList<>();
    }
    /*
    * 向黑板的公告列表添加新公告
    */
    public void update(String newNotice){
        noticeList.add(newNotice);
        System.out.println("Blackboard:update:添加了第"+noticeList.size()+"条公告");
    }
    /*
    * 逐条展示黑板中的公告
    */
    public void inspect(){
        for(int i=0;i<noticeList.size();i++){
            System.out.println("Blackboard:inspect:第"+(i+1)+"条公告为："+noticeList.get(i));
        }
    }
}
