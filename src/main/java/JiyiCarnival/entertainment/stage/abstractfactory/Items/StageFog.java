package JiyiCarnival.entertainment.stage.abstractfactory.Items;

import JiyiCarnival.Output;
import JiyiCarnival.entertainment.stage.abstractfactory.Item;

/**
 * @author muyi
 * 舞台烟雾类
 */
public class StageFog implements Item
{
    @Override
    public void useItem()
    {
        Output.output(this.getClass().toString(),
                "useItem",
                String.valueOf(System.identityHashCode(this)),
                "使用舞台烟雾"
        );
    }

    @Override
    public void useItemPrint() throws InterruptedException {
        System.out.println("斯斯！");
        Thread.sleep(500);
        System.out.println("舞台烟雾缭绕，好似仙境！");
    }
}
