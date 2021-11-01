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
}
