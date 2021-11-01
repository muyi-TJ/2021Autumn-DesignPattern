package JiyiCarnival.mediator;

import JiyiCarnival.Output;
import JiyiCarnival.base.bikes.mediator.StationMediator;
import JiyiCarnival.base.bikes.mediator.StationOne;
import JiyiCarnival.base.bikes.mediator.StationThree;
import JiyiCarnival.base.bikes.mediator.StationTwo;
import org.junit.Test;

public class MediatorTest
{
    @Test
    public void test()
    {
        System.out.println("中介者模式测试：");
        StationMediator stationMediator = new StationMediator();
        StationOne stationOne = new StationOne("StationOne", 15);
        StationTwo stationTwo = new StationTwo("StationTwo", 10);
        StationThree stationThree = new StationThree("StationThree", 5);
        stationOne.setBikeMediator(stationMediator);
        stationTwo.setBikeMediator(stationMediator);
        stationThree.setBikeMediator(stationMediator);

        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "站点向中介系统提出需求"
        );
        stationOne.sendMessage("需要3辆共享单车");
        stationTwo.sendMessage("多余6辆共享单车");
        stationThree.sendMessage("需要5辆共享单车");
    }
}
