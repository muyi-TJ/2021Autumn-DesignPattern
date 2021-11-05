package JiyiCarnival.base.parkinglot.observer;

import JiyiCarnival.Output;

/**
 * @author PinkCrow007
 * 大屏幕类
 */
public class Screen implements Observer
{
    private CarDetectMachine DetectMachine;

    public Screen(CarDetectMachine carDetectMachine)
    {
        DetectMachine = carDetectMachine;
    }

    /**
     * 大屏幕显示总车位与车位剩余情况
     *
     * @param flg
     */
    private void display(boolean flg)
    {
        Output.output(this.getClass().toString(),
                "display",
                String.valueOf(System.identityHashCode(this)),
                "【停车场屏幕】停车场车位剩余:" + DetectMachine.getRestParkingSpace() + "/" + DetectMachine.getMaxParkingSpace()
        );
    }

    private void displayParking(boolean flg)
    {
        System.out.println("停车场屏幕：停车场车位剩余:" + DetectMachine.getRestParkingSpace() + "/" + DetectMachine.getMaxParkingSpace());
    }

    @Override
    public void update(boolean flg)
    {
        display(flg);
    }

    @Override
    public void carUpdate(boolean flg){displayParking(flg);}
}
