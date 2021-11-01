package JiyiCarnival.business.foodstand.factory;
/**
 *@author Caviar011230
 * 小吃工厂接口
 */
public interface SnackFactory {
    /**
     * 制作小吃
     * @return 对应种类的小吃
     */
    abstract Snack produce();
}
