package JiyiCarnival.office.recruit.dependencyinjection;

import JiyiCarnival.Output;

/**
 * @author
 * 报纸渠道
 */
public class NewspaperRecruitChannel implements RecruitChannel{
    @Override
    public void publish(Recruitment recruitment) {
        Output.output(
                this.getClass().toString(),
                "publish",
                String.valueOf(System.identityHashCode(this)),
                "Publish on Newspaper: " + recruitment.message
        );
    }
}
