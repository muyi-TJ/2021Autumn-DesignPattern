package JiyiCarnival.entertainment.hotairballoon.adapter;

import JiyiCarnival.Output;

/**
 * @author WKATZZL
 * 鸟类
 */
public class Bird implements Flyable
{
    /**
     * 鸟儿飞行
     */
    @Override
    public void flyLog()
    {
        Output.output(this.getClass().toString(),
                "fly",
                String.valueOf(System.identityHashCode(this)),
                "鸟儿在空中飞行"
        );
    }
    @Override
    public void fly(){
        System.out.println("鸟儿在空中飞行");
    }
}
