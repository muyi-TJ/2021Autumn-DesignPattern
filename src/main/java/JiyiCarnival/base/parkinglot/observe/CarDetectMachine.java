package JiyiCarnival.base.parkinglot.observe;

public class CarDetectMachine extends Subject {
    static private int MaxParkingSpace;
    static private int RestParkingSpace;

    public CarDetectMachine() {
        MaxParkingSpace=1000;
        RestParkingSpace=1000;
    }

    public CarDetectMachine(int maxParkingSpace, int restParkingSpace) {
        MaxParkingSpace = maxParkingSpace;
        RestParkingSpace = restParkingSpace;
    }

    public int getMaxParkingSpace() {
        return MaxParkingSpace;
    }

    public int getRestParkingSpace() {
        return RestParkingSpace;
    }

    public void CarIn(){
        RestParkingSpace--;
        notifyObserver(true);
    }
    public void CarOut(){
        RestParkingSpace++;
        notifyObserver(false);
    }
}
