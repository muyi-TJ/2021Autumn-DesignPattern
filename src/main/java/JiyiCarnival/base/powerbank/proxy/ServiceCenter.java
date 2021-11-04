package JiyiCarnival.base.powerbank.proxy;

import JiyiCarnival.Output;

/**
 * @author potassiummmm
 * 提供充电宝的活动中心类
 */

public class ServiceCenter implements PowerBankProvider
{
    private int outputType;
    public ServiceCenter(int outputType) {
        this.outputType = outputType;
    }
    /**
     * @param num 充电宝数量
     */
    @Override
    public void getPowerBank(int num)
    {
        if (outputType == 0) {
            Output.output(this.getClass().toString(),
                    "getPowerBank",
                    String.valueOf(System.identityHashCode(this)),
                    "顾客获得了" + num + "个充电宝");
        }
        else {
            System.out.println("游客获得了" + num + "个充电宝");
        }
    }
}
