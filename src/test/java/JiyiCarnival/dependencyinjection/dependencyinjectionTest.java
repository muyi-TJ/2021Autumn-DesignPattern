package JiyiCarnival.dependencyinjection;

import JiyiCarnival.office.recruit.dependencyinjection.NewspaperRecruitChannel;
import JiyiCarnival.office.recruit.dependencyinjection.OnlineRecruitChannel;
import JiyiCarnival.office.recruit.dependencyinjection.RecruitPublisher;
import JiyiCarnival.office.recruit.dependencyinjection.Recruitment;
import org.junit.Test;

public class dependencyinjectionTest {
    @Test
    public void test(){
        System.out.println("依赖注入模式测试：");
        RecruitPublisher publisher = new RecruitPublisher();
        OnlineRecruitChannel online = new OnlineRecruitChannel();
        NewspaperRecruitChannel newspaper = new NewspaperRecruitChannel();

        Recruitment recruitment = new Recruitment("Recruit a dean with a monthly salary of 3000!");

        publisher.publish(recruitment, online);
        publisher.publish(recruitment, newspaper);
    }
}
