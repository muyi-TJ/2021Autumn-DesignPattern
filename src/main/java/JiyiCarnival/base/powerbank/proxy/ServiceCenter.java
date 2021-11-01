package JiyiCarnival.base.powerbank.proxy;

import JiyiCarnival.Output;

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
    public void getPowerBank(int num)
    {
        Output.output(this.getClass().toString(),
                "getPowerBank",
                String.valueOf(System.identityHashCode(this)),
                "顾客获得了" + num + "个充电宝");
    }
}
