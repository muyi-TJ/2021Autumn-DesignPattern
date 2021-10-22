package JiyiCarnival.entertainment.carousel.composite;

/**
 * @author potassiummmm
 * 木马类
 */

public class Horse implements Component {
    private static int cnt = 0;
    private final int index;

    public Horse() {
        cnt++;
        index = cnt;
    }

    @Override
    public void operate() {
        System.out.println(index + "号木马开始旋转");
    }
}
