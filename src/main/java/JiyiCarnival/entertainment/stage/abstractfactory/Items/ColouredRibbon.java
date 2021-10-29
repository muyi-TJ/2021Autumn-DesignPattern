package JiyiCarnival.entertainment.stage.abstractfactory.Items;

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
        System.out.println("使用彩带");
    }
}
