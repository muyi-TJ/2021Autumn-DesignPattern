package JiyiCarnival.entertainment.stage.abstractfactory.Items;

import JiyiCarnival.Output;
import JiyiCarnival.entertainment.stage.abstractfactory.Item;

/**
 * @author muyi
 * 喷水器类
 */
public class Sprinkler implements Item
{
    @Override
    public void useItem()
    {

        Output.output(this.getClass().toString(),
                "useItem",
                String.valueOf(System.identityHashCode(this)),
                "使用喷水器"
        );
    }
}
