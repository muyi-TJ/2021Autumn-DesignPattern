package JiyiCarnival.base.powerbank.proxy;

import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.input.Input;

public class PowerBankControl extends Controller {
    public void flowControl(){
        System.out.println("请输入想租赁的充电宝数量：");
        int num = Input.input();
        Stuff stuff = new Stuff(1);
        stuff.getPowerBank(num);
    }
}
