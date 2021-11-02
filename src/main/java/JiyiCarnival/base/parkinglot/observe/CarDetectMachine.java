package JiyiCarnival.base.parkinglot.observe;

import JiyiCarnival.Output;

/**
 * @author PinkCrow007
 * 车辆探测器类
 */
public class CarDetectMachine extends Subject
{
    static private int MaxParkingSpace;
    static private int RestParkingSpace;
    static private boolean state;

    public CarDetectMachine()
    {
        MaxParkingSpace = 1000;
        RestParkingSpace = 1000;
    }

    public CarDetectMachine(int maxParkingSpace, int restParkingSpace)
    {
        MaxParkingSpace = maxParkingSpace;
        RestParkingSpace = restParkingSpace;
        state = true;
    }

    public static boolean getState()
    {
        return state;
    }

    public int getMaxParkingSpace()
    {
        return MaxParkingSpace;
    }

    public int getRestParkingSpace()
    {
        return RestParkingSpace;
    }

    /**
     * 检测到车辆驶入，通知各观察者类进行相应动作 测试模式
     */
    public void carIn()
    {
        if (RestParkingSpace > 0)
        {
            RestParkingSpace--;
        }
        else
        {
            state = false;
        }
        Output.output(this.getClass().toString(),
                "carIn",
                String.valueOf(System.identityHashCode(this)),
                "检测到车辆准备驶入停车场..."
        );

        notifyObserver(true);
    }

    /**
     * 检测到车辆驶出，通知各观察者类进行相应动作 游乐园模式
     */
    public void carOut()
    {
        RestParkingSpace++;
        state = true;
        Output.output(this.getClass().toString(),
                "carOut",
                String.valueOf(System.identityHashCode(this)),
                "检测到车辆准备驶出停车场..."
        );
        notifyObserver(false);
    }

    /**
     * 检测到车辆驶入，通知各观察者类进行相应动作
     */
    public void visitorCarIn()
    {
        if (RestParkingSpace > 0)
        {
            RestParkingSpace--;
        }
        else
        {
            state = false;
        }
        System.out.println("检测到车辆准备驶入停车场...");
        notifyCarObserver(true);
    }

    /**
     * 检测到车辆驶出，通知各观察者类进行相应动作
     */
    public void visitorCarOut()
    {
        RestParkingSpace++;
        state = true;
        System.out.println("检测到车辆准备驶出停车场...");
        notifyCarObserver(false);
    }

}
