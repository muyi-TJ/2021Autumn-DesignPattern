package JiyiCarnival.entertainment.carousel.composite;

import JiyiCarnival.Output;

/**
 * @author potassiummmm
 * 木马类
 */

public class Horse implements Component
{
    private static int cnt = 0;
    private final int index;
    private int outputType;

    public Horse(int outputType)
    {
        cnt++;
        index = cnt;
        this.outputType = outputType;
    }

    @Override
    public void operate()
    {
        if (outputType == 0) {
            Output.output(this.getClass().toString(),
                    "operate",
                    String.valueOf(System.identityHashCode(this)),
                    index + "号木马开始旋转");
        }
        else {
            System.out.println(index + "号木马开始旋转");
        }
    }
}
