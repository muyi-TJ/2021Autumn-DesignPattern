package JiyiCarnival.base.powerbank.proxy;

import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.time.Clock;

/**
 * @author WKATZZL
 * 充电宝控制类
 */
public class PowerBankControl extends Controller {
    /**
     * 流程控制
     */
    public void flowControl(){
        System.out.println("请输入想租赁的充电宝数量：");
        int num = Input.input();
        Stuff stuff = new Stuff(1);
        stuff.getPowerBank(num);
        Clock.addTime(5);
    }
}
