package JiyiCarnival.entertainment.movie.flyweight;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.strvideo.StrVideo;
import JiyiCarnival.util.time.Clock;

import java.io.IOException;

public class MovieControl extends Controller {
    private String[] names = {"寻梦环游记", "花木兰", "精灵旅社", "精灵旅社2"};
    public void flowControl() throws InterruptedException, IOException {
        if(!Clock.timeCheck(12, 14)){
            Clock.printNowTime();
            System.out.print("尊敬的游客，很抱歉！现在不在电影的观看时间哦！");
            System.out.println("请注意查看公告栏上各游乐地点的开放时间！");
            return;
        }
        Movie movice = new Movie(names);
        movice.play(JiyiCarnival.getVisitor());
        StrVideo strVideo = new StrVideo("src\\main\\java\\JiyiCarnival\\imgs\\movie");
        strVideo.play(255, 0, 0, true);
        strVideo.close();
        Clock.addTime(90);
    }
}
