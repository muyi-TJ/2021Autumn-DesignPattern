package JiyiCarnival.base.parkinglot.observe;

public class Screen implements Observer{
    @Override
     public void update(boolean flg) {
        System.out.println("停车场车位变化");
     }
}
