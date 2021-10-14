package JiyiCarnival.base.parkinglot.observe;

public class Printer implements Observer{
    @Override
    public void update(boolean flg) {
       if(flg) System.out.println("欢迎您来到停车场，祝您游玩愉快");
       else System.out.println("欢迎您下次再来");
    }
}
