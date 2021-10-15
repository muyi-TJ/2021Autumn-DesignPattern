package JiyiCarnival.base.parkinglot.observe;

public class Broadcaster implements Observer{
    private CarDetectMachine DetectMachine;
    public Broadcaster(CarDetectMachine carDetectMachine) {
        DetectMachine=carDetectMachine;
    }
    @Override
    public void update(boolean flg) {
        if(!DetectMachine.getState()){
            System.out.println("【播报器】十分抱歉，停车场已满");
            return;
        }
       if(flg) System.out.println("【播报器】欢迎您来到停车场，祝您游玩愉快!");
       else System.out.println("【播报器】欢迎您下次再来!");
    }
}
