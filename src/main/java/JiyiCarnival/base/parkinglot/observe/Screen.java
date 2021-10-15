package JiyiCarnival.base.parkinglot.observe;

public class Screen implements Observer{
    private CarDetectMachine DetectMachine;
    public Screen(CarDetectMachine carDetectMachine) {
        DetectMachine=carDetectMachine;
    }

    @Override
     public void update(boolean flg) {
        System.out.println("【停车场屏幕】停车场车位剩余:"+DetectMachine.getRestParkingSpace()+"/"+DetectMachine.getMaxParkingSpace());
     }
}
