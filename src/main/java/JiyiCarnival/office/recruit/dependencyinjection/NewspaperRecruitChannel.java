package JiyiCarnival.office.recruit.dependencyinjection;

/**
 * @author
 * 报纸渠道
 */
public class NewspaperRecruitChannel implements RecruitChannel{
    @Override
    public void publish(Recruitment recruitment) {
        System.out.println("Publish on Newspaper: " + recruitment.message);
    }
}
