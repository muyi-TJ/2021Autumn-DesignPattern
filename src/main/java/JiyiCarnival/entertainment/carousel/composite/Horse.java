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
    public void operate() throws InterruptedException {
        if (outputType == 0) {
            Output.output(this.getClass().toString(),
                    "operate",
                    String.valueOf(System.identityHashCode(this)),
                    index + "号木马开始旋转");
        }
        else {
            System.out.print("旋转中");
            for(int i = 0; i<3; i++){
                System.out.print('.');
                Thread.sleep(400);
            }
            System.out.println();
        }
    }
}
