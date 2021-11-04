package JiyiCarnival.entertainment.movice.flyweight;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.time.Clock;

public class MovieControl extends Controller {
    private String[] names = {"寻梦环游记", "花木兰", "精灵旅社", "精灵旅社2"};
    public void flowControl() throws InterruptedException {
        if(!Clock.timeCheck(12, 14)){
            Clock.printNowTime();
            System.out.print("尊敬的游客，很抱歉！现在不在电影的观看时间哦！");
            System.out.println("请注意查看公告栏上各游乐地点的开放时间！");
        }
        Movice movice = new Movice(names);
        movice.play(JiyiCarnival.getVisitor());
    }
}
