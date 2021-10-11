package JiyiCarnival.base.powerbank.proxy;

/**
 * @author potassiummmm
 * 提供充电宝的活动中心类
 */

public class ServiceCenter implements PowerBankProvider
{
    /**
     * @param num 充电宝数量
     */
    @Override
    public void getPowerBank(int num) {
        System.out.println("顾客获得了" + num + "个充电宝");
    }
}
