package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 可乐工厂类
 */
public class CokeFactory extends SnackFactory{
    public Coke produce(){
        return new Coke();
    }
}
