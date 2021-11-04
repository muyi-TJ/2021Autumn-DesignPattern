package JiyiCarnival.base.bikes.mediator;

import JiyiCarnival.Output;

/**
 * 站点类
 */
public class Station
{
    protected String name;
    protected Integer bikeNumber;
    protected StationMediator bikeMediator;


    /**
     * Station构造器
     *
     * @param name   站点名称
     * @param number 站点共享单车的数量
     */
    Station(String name, Integer number)
    {
        this.name = name;
        this.bikeNumber = number;
//        Output.output(
//                this.getClass().toString(),
//                "initialize",
//                String.valueOf(System.identityHashCode(this)),
//                name + "处有" + bikeNumber + "辆共享单车"
//        );
        System.out.println(name+"处有"+bikeNumber + "辆共享单车");
    }

    /**
     * 站点名getter
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * 站点名setter
     *
     * @param name 站点名称
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * 站点共享单车数量getter
     */
    public Integer getBikeNumber()
    {
        return this.bikeNumber;
    }

    /**
     * 站点共享单车数量setter
     *
     * @param bikeNumber 共享单车的数量
     */
    public void setBikeNumber(Integer bikeNumber)
    {
        this.bikeNumber = bikeNumber;
    }

    /**
     * 中介系统getter
     */
    public StationMediator getBikeMediator()
    {
        return bikeMediator;
    }

    /**
     * 设置商店的中介系统
     */
    public void setBikeMediator(StationMediator bikeMediator)
    {
        this.bikeMediator = bikeMediator;
//        Output.output(
//                this.getClass().toString(),
//                "initialize",
//                String.valueOf(System.identityHashCode(this)),
//                "设置" + name + "处的中介系统"
//        );
        System.out.println("站点工作人员即将为您服务！");
        bikeMediator.addStation(this);
    }

    /**
     * 站点汇报自己的需求信息
     */
    public void sendMessage(String str)
    {
//        Output.output(
//                this.getClass().toString(),
//                "initialize",
//                String.valueOf(System.identityHashCode(this)),
//                name + "汇报自己的需求信息:" + str
//        );
//        System.out.println("您选择电话联系工作人员为您进行单车调度。");
        System.out.println("您一共需要"+str);
        bikeMediator.tellMsg(this, str);
    }

    /**
     * 站点查看其他商店的需求信息
     */
    public void readMessage(Station station)
    {
//        Output.output(
//                this.getClass().toString(),
//                "initialize",
//                String.valueOf(System.identityHashCode(this)),
//                this.getName() + "查看了" + station.getName() + "的需求信息"
//        );
        System.out.println(name+"站点处工作人员正在处理您的需求……");
        System.out.println("您已在"+name+"完成单车租赁，祝您游玩愉快！");
    }
}
