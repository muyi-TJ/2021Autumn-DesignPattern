package JiyiCarnival.entertainment.stage.abstractfactory.Items;

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
        System.out.println("使用舞台烟雾");
    }
}
