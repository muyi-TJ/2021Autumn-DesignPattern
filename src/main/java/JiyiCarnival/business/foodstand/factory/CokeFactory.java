package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 可乐工厂类
 */
public class CokeFactory implements SnackFactory{
    @Override
    public Coke produce(){
        return new Coke();
    }
}
