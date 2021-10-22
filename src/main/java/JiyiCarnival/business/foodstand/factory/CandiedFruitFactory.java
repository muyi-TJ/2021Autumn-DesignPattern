package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 糖葫芦工厂类
 */
public class CandiedFruitFactory implements SnackFactory{
    @Override
    public CandiedFruit produce(){
        return new CandiedFruit();
    }
}
