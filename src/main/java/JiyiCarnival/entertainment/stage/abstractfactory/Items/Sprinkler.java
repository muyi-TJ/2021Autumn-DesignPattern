package JiyiCarnival.entertainment.stage.abstractfactory.Items;

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
        System.out.println("使用喷水器");
    }
}
