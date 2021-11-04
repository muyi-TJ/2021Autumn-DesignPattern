package JiyiCarnival.business.foodstand.factory;

import JiyiCarnival.util.input.Input;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 一个点餐的示例
 * @author Caviar011230
 */
public class FactoryDemo
{
    /**
     * 点餐示例
     */
    public static void demo()
    {
        SnackFactory snackFactory = new SnackFactory();

        int snackNum = 0;
        //while(snackNum != -1)
        //{
            System.out.println("欢迎来到小吃摊，请选择你需要的小吃([1]糖葫芦[2]可乐[3]炸鸡),输入-1退出点餐");
            snackNum = Input.input();
            String snackName = "";
            switch (snackNum)
            {
                case 1:
                    snackName = "CandiedFruit";
                    break;
                case 2:
                    snackName = "Coke";
                    break;
                case 3:
                    snackName = "FriedChicken";
                    break;
            }
            Snack snack = snackFactory.produce(snackName);
            if(snack != null)
            {
                snack.get();
            }
            else if(snackNum != -1)
            {
                System.out.println("您选择的数字不存在对应小吃！");
            }
            else
            {
                System.out.println("感谢您的本次点单！");
            }
        //}
    }
}
