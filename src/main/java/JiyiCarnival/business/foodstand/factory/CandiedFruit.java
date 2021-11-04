package JiyiCarnival.business.foodstand.factory;

import JiyiCarnival.Output;

/**
 * @author Caviar011230
 * 糖葫芦类
 */

public class CandiedFruit implements Snack
{
    /**
     * 获取糖葫芦 测试模式
     */
    @Override
    public void get()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "制作出了一根糖葫芦"
        );
    }

    /**
     * 获取糖葫芦 游乐园模式
     */
    @Override
    public void getPrint() throws InterruptedException {
        System.out.println("尊敬的游客请稍候，您点的糖葫芦马上就好");
        for(int i=0; i<4; i++){
            System.out.print('.');
            Thread.sleep(500);
        }
        System.out.println();
        System.out.println("铛铛！美滋滋的糖葫芦做好啦！");
    }
}
