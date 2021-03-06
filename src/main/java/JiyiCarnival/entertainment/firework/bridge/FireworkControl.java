package JiyiCarnival.entertainment.firework.bridge;

import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.strvideo.StrVideo;
import JiyiCarnival.util.time.Clock;

import java.io.IOException;

/**
 * @author WKATZZL
 * 烟花释放流程控制
 */
public class FireworkControl extends Controller {
    /**
     * 流程控制
     */
    public void flowControl() throws InterruptedException, IOException {
        if(!Clock.timeCheck(18, 22)){
            Clock.printNowTime();
            System.out.print("尊敬的游客，很抱歉！现在不在观看烟花的时间哦！");
            System.out.println("请注意查看公告栏上各游乐地点的开放时间！");
            return;
        }
        FlowerFirework blueFlowerFirework = new FlowerFirework(new Blue());
        HeartFirework redHeartFirework = new HeartFirework(new Red());
        FlowerFirework redFlowerFirework = new FlowerFirework(new Blue());
        HeartFirework blueHeartFirework = new HeartFirework(new Red());
        blueFlowerFirework.letOffPrint();
        redHeartFirework.letOffPrint();
        redFlowerFirework.letOffPrint();
        blueHeartFirework.letOffPrint();
        StrVideo strVideo = new StrVideo("src\\main\\java\\JiyiCarnival\\imgs\\firework");
        strVideo.play(255, 70, 0, true);
        strVideo.close();
        Clock.addTime(60);
    }
}
