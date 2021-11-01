package JiyiCarnival.entertainment.carousel.composite;

import JiyiCarnival.Output;

import java.util.ArrayList;

/**
 * @author potassiummmm
 * 旋转木马中轴类
 */

public class Axis extends ArrayList<Component> implements Component
{
    @Override
    public void operate()
    {
        Output.output(this.getClass().toString(),
                "operate",
                String.valueOf(System.identityHashCode(this)),
                "旋转木马中轴开始旋转");
        for (Component component : this)
        {
            component.operate();
        }
    }
}
