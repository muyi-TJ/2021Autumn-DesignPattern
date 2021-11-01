package JiyiCarnival.office.recruit.dependencyinjection;

import JiyiCarnival.Output;

/**
 * @author ajt
 * 网上渠道
 */
public class OnlineRecruitChannel implements RecruitChannel
{

    @Override
    public void publish(Recruitment recruitment)
    {
        Output.output(
                this.getClass().toString(),
                "publish",
                String.valueOf(System.identityHashCode(this)),
                "Publish Online: " + recruitment.message
        );
    }
}
