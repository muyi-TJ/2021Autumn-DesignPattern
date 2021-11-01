package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 糖葫芦工厂类
 */
public class CandiedFruitFactory implements SnackFactory{
    /**
     * 生产一根糖葫芦
     * @return 糖葫芦
     */
    @Override
    public CandiedFruit produce(){
        return new CandiedFruit();
    }
}
