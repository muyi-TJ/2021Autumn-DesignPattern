package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 炸鸡工厂类
 */
public class FriedChickenFactory extends SnackFactory{
    public FriedChicken produce(){
        return new FriedChicken();
    }
}
