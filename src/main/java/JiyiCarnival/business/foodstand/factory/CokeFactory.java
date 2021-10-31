package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 可乐工厂类
 */
public class CokeFactory implements SnackFactory{
    /**
     * 生产一杯可乐
     * @return 可乐
     */
    @Override
    public Coke produce(){
        return new Coke();
    }
}
