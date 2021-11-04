package JiyiCarnival.entertainment.activate.Template;

import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.time.Clock;

public class ActivityUI extends Controller {
    public void flowControl() throws InterruptedException {
        System.out.println("来得正好！有两场主题活动正在火热进行！");
        int opt=1;
        while(opt>0){
            System.out.println("请选择：\n[1]生日礼遇 [2]万圣节娱乐演出 [0]离开");
            opt= Input.input();
            switch (opt){
                case 1:
                    Clock.addTime(60);
                    JiyiCarnival.entertainment.activate.template.ActivateTemplate birthdayActivate = new JiyiCarnival.entertainment.activate.template.activates.BirthdayActivate();
                    birthdayActivate.playActivatePrint();
                    opt = 0;
                    break;
                case 2:
                    Clock.addTime(70);
                    JiyiCarnival.entertainment.activate.template.ActivateTemplate halloweenActivate = new JiyiCarnival.entertainment.activate.template.activates.HalloweenActivate();
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
