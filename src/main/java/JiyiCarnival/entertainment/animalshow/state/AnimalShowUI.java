package JiyiCarnival.entertainment.animalshow.state;

import JiyiCarnival.util.time.Clock;

public class AnimalShowUI {
    public void AnimalShowUI(){};
    public void flowControl() throws InterruptedException {
        if(!Clock.timeCheck(15, 17)){
            Clock.printNowTime();
            System.out.print("尊敬的游客，很抱歉！现在不在动物表演的观看时间哦！");
            System.out.println("请注意查看公告栏上各游乐地点的开放时间！");
        }
        AnimalShow animalShow = new AnimalShow();
        BeginShowState beginShowState = new BeginShowState();
        EndShowState endShowState = new EndShowState();
        FailState failState = new FailState();
        SucceedState succeedState = new SucceedState();
        beginShowState.printAction(animalShow);
        failState.printAction(animalShow);
        succeedState.printAction(animalShow);
        endShowState.printAction(animalShow);
        Clock.addTime(60);
    }
}
