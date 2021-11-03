package JiyiCarnival.entertainment.shooting.memento;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.entertainment.hotairballoon.adapter.HotAirBalloonAdapter;
import JiyiCarnival.util.input.Input;

import java.util.Scanner;

/**
 * @author WKATZZL
 * shooting 射击的UI
 */
public class ShootingUI {
    public void ShootingUI(){}

    /**
     * 射击游戏
     * @throws InterruptedException 线程睡眠
     */
    private void playShooting() throws InterruptedException {
        RecordOriginator player = new RecordOriginator();
        String nickName;
        System.out.println("请输入您本次进入游戏的昵称");
        Scanner scan = new Scanner(System.in);
        nickName = scan.nextLine();
        Integer score;
        for(int i = 0; i < 6; i++){
            System.out.print('.');
            Thread.sleep(500);
        }
        score = (int)(Math.random() * 40 + 60);
        System.out.println("\n经过紧张刺激的射击环节，您的得分是：");
        System.out.println(score);
        player.setRecord(nickName, score);
        JiyiCarnival.getRecordCaretaker().saveRecord(player.createMemento());
    }


    /**
     * 控制流
     * @throws InterruptedException
     */
    public void flowControl() throws InterruptedException {
        int choice = 1;
        while(choice > 0){
            System.out.println("请选择：\n[1] 进行射击游戏\n[2] 查看记录\n[3] 退出\n");
            choice = Input.input();
            switch (choice){
                case 1:
                    playShooting();
                    break;
                case 2:
                    JiyiCarnival.getRecordCaretaker().printRecord();
                    break;
                case 3:
                    choice = 0;
                    System.out.println("祝您玩得愉快！再见！");
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }


    }
}
