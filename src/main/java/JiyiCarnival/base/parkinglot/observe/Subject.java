package JiyiCarnival.base.parkinglot.observe;

import java.util.Vector;

public class Subject {
    private Vector<Observer> ObserverList = new Vector<>();
    public void addObserver(Observer observer) {
                 this.ObserverList.add(observer);
    }
    public void notifyObserver(boolean flg) {
                 for(Observer observer : this.ObserverList) {
                        observer.update(flg);
                     }
            }
}
