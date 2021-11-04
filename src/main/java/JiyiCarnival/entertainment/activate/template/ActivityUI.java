package JiyiCarnival.entertainment.activate.template;

import JiyiCarnival.entertainment.activate.template.activates.BirthdayActivate;
import JiyiCarnival.entertainment.activate.template.activates.HalloweenActivate;
import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.time.Clock;

public class ActivityUI extends Controller {
    public void flowControl() throws InterruptedException {
        System.out.println(JiyiCarnival.getVisitor().getName() +",来得正好！有两场主题活动马上就要开始啦！");
        int opt=1;
        while(opt>0){
            System.out.println("请选择：\n[1]生日礼遇 [2]万圣节娱乐演出 [0]离开");
            opt= Input.input();
            switch (opt){
                case 1:
                    Clock.addTime(60);
                    ActivateTemplate birthdayActivate = new BirthdayActivate();
                    birthdayActivate.playActivatePrint();
                    opt = 0;
                    break;
                case 2:
                    Clock.addTime(70);
                    ActivateTemplate halloweenActivate = new HalloweenActivate();
                    halloweenActivate.playActivatePrint();
                    opt = 0;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }

        }
    }
}
