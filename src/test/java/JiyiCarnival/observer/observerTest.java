package JiyiCarnival.observer;

import JiyiCarnival.base.parkinglot.observe.CarDetectMachine;
import JiyiCarnival.base.parkinglot.observe.Broadcaster;
import JiyiCarnival.base.parkinglot.observe.Screen;
import org.junit.Test;

public class observerTest {
    @Test
    public void test(){
        System.out.println("观察者模式测试：");
        CarDetectMachine carDetectMachine=new CarDetectMachine(100,3);
        System.out.println("济忆嘉年华停车场共有 "+carDetectMachine.getMaxParkingSpace()+" 停车位，可用 "+carDetectMachine.getRestParkingSpace()+" 停车位");
        carDetectMachine.addObserver(new Broadcaster(carDetectMachine));
        carDetectMachine.addObserver(new Screen(carDetectMachine));
        carDetectMachine.CarIn();
        carDetectMachine.CarIn();
        carDetectMachine.CarIn();
        carDetectMachine.CarIn();
        carDetectMachine.CarIn();
        carDetectMachine.CarIn();
        carDetectMachine.CarOut();
        carDetectMachine.CarIn();
    }
}
