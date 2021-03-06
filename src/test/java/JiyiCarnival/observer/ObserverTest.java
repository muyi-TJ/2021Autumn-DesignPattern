package JiyiCarnival.observer;

import JiyiCarnival.base.parkinglot.observer.Broadcaster;
import JiyiCarnival.base.parkinglot.observer.CarDetectMachine;
import JiyiCarnival.base.parkinglot.observer.Screen;
//import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class ObserverTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("观察者模式测试：");
        CarDetectMachine carDetectMachine = new CarDetectMachine(100, 3);
        System.out.println("济忆嘉年华停车场共有 " + carDetectMachine.getMaxParkingSpace() + " 停车位，目前可用 " + carDetectMachine.getRestParkingSpace() + " 停车位");
        carDetectMachine.addObserver(new Broadcaster(carDetectMachine));
        carDetectMachine.addObserver(new Screen(carDetectMachine));
        carDetectMachine.carIn();
        carDetectMachine.carIn();
        carDetectMachine.carIn();
        carDetectMachine.carIn();
        carDetectMachine.carIn();
        carDetectMachine.carIn();
        carDetectMachine.carOut();
        carDetectMachine.carIn();
    }
}
