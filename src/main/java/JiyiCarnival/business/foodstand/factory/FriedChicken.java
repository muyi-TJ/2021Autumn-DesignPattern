package JiyiCarnival.business.foodstand.factory;

import JiyiCarnival.Output;

/**
 * @author Caviar011230
 * 炸鸡类
 */
public class FriedChicken implements Snack
{
    /**
     * 获取炸鸡 测试模式
     */
    @Override
    public void get()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "制作出了一份炸鸡"
        );
    }

    /**
     * 获取炸鸡 游乐园模式
     */
    @Override
    public void getPrint() throws InterruptedException {
        System.out.println("尊敬的游客请稍候，您点的炸鸡马上就好");
        for(int i=0; i<4; i++){
            System.out.print('.');
            Thread.sleep(500);
        }
        System.out.println();
        System.out.println("铛铛！香喷喷的炸鸡做好啦！");
    }
}
