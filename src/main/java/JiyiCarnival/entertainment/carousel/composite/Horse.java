package JiyiCarnival.entertainment.carousel.composite;

import JiyiCarnival.Output;

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
        Output.output(this.getClass().toString(),
                "operate",
                String.valueOf(System.identityHashCode(this)),
                index + "号木马开始旋转");
    }
}
