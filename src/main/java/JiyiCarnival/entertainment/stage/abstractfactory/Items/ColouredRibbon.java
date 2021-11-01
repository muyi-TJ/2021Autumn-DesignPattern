package JiyiCarnival.entertainment.stage.abstractfactory.Items;

import JiyiCarnival.entertainment.stage.abstractfactory.Item;
import JiyiCarnival.Output;

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
}
