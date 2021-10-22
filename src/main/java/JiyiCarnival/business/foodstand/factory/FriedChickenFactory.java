package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 炸鸡工厂类
 */
public class FriedChickenFactory implements SnackFactory{
    @Override
    public FriedChicken produce(){
        return new FriedChicken();
    }
}
