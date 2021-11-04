package JiyiCarnival.entertainment.carousel.composite;

import JiyiCarnival.util.control.Controller;

public class HorseControl extends Controller {
    public void flowControl() throws InterruptedException {
        Axis axis = new Axis(1);
        System.out.println("尊敬的游客，欢迎乘坐济忆旋转木马！");
        System.out.println("准备好了吗，我们马上就要开始啦！");
        for (int i = 0; i < 3; i++) {
            axis.add(new Horse(1));
        }
        axis.operate();
    }
}
