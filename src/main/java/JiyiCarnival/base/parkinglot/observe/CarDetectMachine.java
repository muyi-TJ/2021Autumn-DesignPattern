package JiyiCarnival.base.parkinglot.observe;
//还没写完
public class CarDetectMachine extends Subject {
    static private int MaxParkingSpace;
    static private int RestParkingSpace;
    static private boolean state;

    public CarDetectMachine() {
        MaxParkingSpace=1000;
        RestParkingSpace=1000;
    }

    public CarDetectMachine(int maxParkingSpace, int restParkingSpace) {
        MaxParkingSpace = maxParkingSpace;
        RestParkingSpace = restParkingSpace;
        state=true;
    }

    public int getMaxParkingSpace() {
        return MaxParkingSpace;
    }

    public int getRestParkingSpace() {
        return RestParkingSpace;
    }

    public static boolean getState() {
        return state;
    }

    public void CarIn(){
        if(RestParkingSpace>0) RestParkingSpace--;
        else state=false;
        System.out.println("检测到车辆准备驶入停车场...");
        notifyObserver(true);
    }
    public void CarOut(){
        RestParkingSpace++;
        state=true;
        System.out.println("检测到车辆准备驶出停车场...");
        notifyObserver(false);
    }

}
