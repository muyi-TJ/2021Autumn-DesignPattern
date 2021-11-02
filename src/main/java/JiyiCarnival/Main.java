package JiyiCarnival;


import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.util.input.Input;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("欢迎来到济忆嘉年华！");
        int choice = 0;
        while(0 == choice) {
            System.out.println("请选择运行方式：\n[1] 游玩模式\n[2] 测试模式\n[3] 退出");
            choice = Input.input();
            switch (choice){
                case 1:
                    JiyiCarnival carnival = JiyiCarnival.getInstance();
                    carnival.flowControl();
                    choice = 0;
                    break;
                case 2:
                    choice = 0;
                    break;
                case 3:
                    System.out.println("今日的离开，是为了明日更好的相聚！");
                    System.out.println("济忆嘉年华永远欢迎您的到来！再见！");
                    break;
                default:
                    choice = 0;
                    break;
            }
        }
    }
}
