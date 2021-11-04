package JiyiCarnival.business.foodstand.factory;

import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.time.Clock;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 一个点餐的示例
 * @author Caviar011230
 */
public class SnackBlockUI
{
    /**
     * 点餐示例
     */
    public void flowControl() throws InterruptedException {
        SnackFactory snackFactory = new SnackFactory();

        int snackNum = 1;
        System.out.println("欢迎来到小吃摊，请选择你需要的小吃([1]糖葫芦[2]可乐[3]炸鸡),输入4退出点餐");
        while(snackNum > 0)
        {
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
                case 4:
                    snackNum = 0;
                    break;
            }
            Snack snack = snackFactory.produce(snackName);
            if(snack != null)
            {
                snack.getPrint();
                Clock.addTime(15);
                System.out.println("是否需要继续点单呢([1]糖葫芦[2]可乐[3]炸鸡),输入4退出点餐");
            }
            else if(snackNum == -1 || snackNum > 4)
            {
                System.out.println("您的选择没有对应的小吃！");
                System.out.println("请重新选择你需要的小吃([1]糖葫芦[2]可乐[3]炸鸡),输入4退出点餐");
            }
            else
            {
                System.out.println("感谢您的本次点单！");
                return;
            }
        }
    }
}
