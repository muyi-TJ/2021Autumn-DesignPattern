package JiyiCarnival.entertainment.stage.abstractfactory;

import JiyiCarnival.entertainment.stage.abstractfactory.Items.ColouredRibbon;
import JiyiCarnival.entertainment.stage.abstractfactory.Items.Sprinkler;
import JiyiCarnival.entertainment.stage.abstractfactory.Items.StageFog;

/**
 * @author muyi
 * 物品工厂类
 */
public class ItemFactory extends AbstractFactory
{
    @Override
    public Lighting getLighting(String lighting)
    {
        return null;
    }

    @Override
    public Item getItem(String item)
    {
        if (item == null)
        {
            return null;
        }
        if (item == "StageFog")
        {
            return new StageFog();
        }
        else if (item == "Sprinkler")
        {
            return new Sprinkler();
        }
        else if (item == "ColouredRibbon")
        {
            return new ColouredRibbon();
        }
        return null;
    }
}
