package JiyiCarnival.base.powerbank.proxy;

/**
 * @author potassiummmm
 * 从活动中心获取充电宝并提供给游客的流动工作人员类
 */

public class Stuff implements PowerBankProvider
{
    private final ServiceCenter serviceCenter;
    private int outputType = 0;

    public Stuff(int outputType)
    {
        this.serviceCenter = new ServiceCenter(outputType);
    }

    /**
     * @param num 充电宝数量
     */
    @Override
    public void getPowerBank(int num)
    {
        serviceCenter.getPowerBank(num);
    }
}
