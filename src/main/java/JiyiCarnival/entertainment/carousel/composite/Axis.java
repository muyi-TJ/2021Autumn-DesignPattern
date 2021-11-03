package JiyiCarnival.entertainment.carousel.composite;

import JiyiCarnival.Output;

import java.util.ArrayList;

/**
 * @author potassiummmm
 * 旋转木马中轴类
 */

public class Axis extends ArrayList<Component> implements Component
{
    private int outputType;
    public Axis(int outputType) {
        this.outputType = outputType;
    }
    @Override
    public void operate()
    {
        if (outputType == 0) {
            Output.output(this.getClass().toString(),
                    "operate",
                    String.valueOf(System.identityHashCode(this)),
                    "旋转木马中轴开始旋转");
        }
        else {
            System.out.println("旋转木马中轴开始旋转");
        }

        for (Component component : this)
        {
            component.operate();
        }
    }
}
