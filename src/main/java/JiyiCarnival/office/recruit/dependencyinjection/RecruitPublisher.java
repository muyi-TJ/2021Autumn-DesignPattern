package JiyiCarnival.office.recruit.dependencyinjection;

/**
 * @author ajt
 * 依赖注入类
 */
public class RecruitPublisher
{

    /**
     * 在channel中发布recruitment
     *
     * @param recruitment 招聘信息
     * @param channel     发布渠道
     */
    public void publish(Recruitment recruitment, RecruitChannel channel)
    {
        channel.publish(recruitment);
    }
}
