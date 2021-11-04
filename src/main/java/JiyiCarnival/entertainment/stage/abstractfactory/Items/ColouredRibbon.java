package JiyiCarnival.entertainment.stage.abstractfactory.Items;

import JiyiCarnival.Output;
import JiyiCarnival.entertainment.stage.abstractfactory.Item;

/**
 * @author muyi
 * 彩带类
 */
public class ColouredRibbon implements Item
{
    @Override
    public void useItem()
    {
        Output.output(this.getClass().toString(),
                "useItem",
                String.valueOf(System.identityHashCode(this)),
                "使用彩带"
        );
    }

    @Override
    public void useItemPrint() throws InterruptedException {
       System.out.println("沙沙！");
       Thread.sleep(1000);
       System.out.println("彩带在空中飞舞");
       Thread.sleep(500);
    }


}
