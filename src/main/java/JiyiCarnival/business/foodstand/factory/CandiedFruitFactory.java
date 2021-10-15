package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 糖葫芦工厂类
 */
public class CandiedFruitFactory extends SnackFactory{
    public CandiedFruit produce(){
        return new CandiedFruit();
    }
}
