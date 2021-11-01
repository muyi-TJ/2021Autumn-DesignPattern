package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 炸鸡工厂类
 */
public class FriedChickenFactory implements SnackFactory{
    /**
     * 生产一份炸鸡
     * @return 炸鸡
     */
    @Override
    public FriedChicken produce(){
        return new FriedChicken();
    }
}
