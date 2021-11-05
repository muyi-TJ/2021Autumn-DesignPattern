package JiyiCarnival.entertainment.animalshow.state;

import JiyiCarnival.util.time.Clock;

public class AnimalShowUI {
    public void AnimalShowUI(){};
    public void flowControl() throws InterruptedException {
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
