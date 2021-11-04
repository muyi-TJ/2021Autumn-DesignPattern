package JiyiCarnival.entertainment.carousel.composite;

import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.time.Clock;

public class HorseControl extends Controller {
    public void flowControl() throws InterruptedException {
        if(!Clock.timeCheck(18, 22)){
            Clock.printNowTime();
            System.out.print("尊敬的游客，很抱歉！现在是不在旋转木马的乘坐时间哦！");
            System.out.println("请注意查看公告栏上各游乐地点的开放时间！");
        }
        Axis axis = new Axis(1);
        System.out.println("尊敬的游客，欢迎乘坐济忆旋转木马！");
        System.out.println("准备好了吗，我们马上就要开始啦！");
        for (int i = 0; i < 3; i++) {
            axis.add(new Horse(1));
        }
        axis.operate();
    }
}
