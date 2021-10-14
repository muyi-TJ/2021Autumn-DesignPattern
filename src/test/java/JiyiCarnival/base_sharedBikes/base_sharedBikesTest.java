package JiyiCarnival.base_sharedBikes;

import JiyiCarnival.base.sharedBikes.StationMediator;
import JiyiCarnival.base.sharedBikes.StationOne;
import JiyiCarnival.base.sharedBikes.StationThree;
import JiyiCarnival.base.sharedBikes.StationTwo;
import org.junit.Test;

public class base_sharedBikesTest {
    @Test
    public void test(){
        System.out.println("中介者模式测试：");
        StationMediator stationMediator=new StationMediator();
        StationOne stationOne=new StationOne("StationOne",15);
        StationTwo stationTwo=new StationTwo("StationTwo",10);
        StationThree stationThree=new StationThree("StationThree",5);
        stationOne.setBikeMediator(stationMediator);
        stationTwo.setBikeMediator(stationMediator);
        stationThree.setBikeMediator(stationMediator);

        System.out.println("站点向中介系统提出需求");
        stationOne.sendMessage("需要3辆共享单车");
        stationTwo.sendMessage("多余6辆共享单车");
        stationThree.sendMessage("需要5辆共享单车");
    }
}
