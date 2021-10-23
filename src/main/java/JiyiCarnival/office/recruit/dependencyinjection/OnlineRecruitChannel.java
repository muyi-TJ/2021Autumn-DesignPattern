package JiyiCarnival.office.recruit.dependencyinjection;

/**
 * @author ajt
 * 网上渠道
 */
public class OnlineRecruitChannel implements RecruitChannel {

    @Override
    public void publish(Recruitment recruitment) {
        System.out.println("Publish Online: " + recruitment.message);
    }
}
