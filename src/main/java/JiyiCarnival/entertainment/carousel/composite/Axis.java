package JiyiCarnival.entertainment.carousel.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author potassiummmm
 * 旋转木马中轴类
 */

public class Axis extends ArrayList<Component> implements Component {
    @Override
    public void operate() {
        System.out.println("旋转木马中轴开始旋转");
        for (Component component : this) {
            component.operate();
        }
    }
}
