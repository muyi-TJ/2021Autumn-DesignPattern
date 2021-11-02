package JiyiCarnival;


import JiyiCarnival.util.input.Input;

public class Main {
    public static void main(String[] args){
        System.out.println("欢迎来到济忆嘉年华！");
        int choice = 0;

        while(0 == choice) {
            System.out.println("选择运行方式：\n[1]自由行游玩\n[2]青春挑战路线\n[3]浪漫情侣路线\n[4]童真欢乐路线\n[5]测试模式");
            choice = Input.input();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    choice = 0;
                    break;
            }
        }
    }
}
