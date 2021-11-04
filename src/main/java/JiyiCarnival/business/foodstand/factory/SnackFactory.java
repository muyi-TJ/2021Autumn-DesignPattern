package JiyiCarnival.business.foodstand.factory;

/**
 * @author Caviar011230
 * 小吃工厂接口
 */
public class SnackFactory
{
    /**
     * 制作小吃
     * @param snackName 小吃名称
     * @return 对应种类的小吃
     */

    public Snack produce(String snackName)
    {
      Snack snack = null;
      if(snackName.equals("CandiedFruit"))
      {
          snack = new CandiedFruit();
      }
      else if(snackName.equals("Coke"))
      {
          snack = new Coke();
      }
      else if(snackName.equals("FriedChicken"))
      {
          snack = new FriedChicken();
      }
      return snack;
    }
}
