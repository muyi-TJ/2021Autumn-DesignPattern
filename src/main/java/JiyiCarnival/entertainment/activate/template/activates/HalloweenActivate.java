package JiyiCarnival.entertainment.activate.template.activates;

import JiyiCarnival.Output;
import JiyiCarnival.entertainment.activate.template.ActivateTemplate;

/**
 * @author ajt
 * “万圣节娱乐演出”主题活动
 */
public class HalloweenActivate extends ActivateTemplate
{
    @Override
    public void play()
    {
        Output.output(
                this.getClass().toString(),
                "play",
                String.valueOf(System.identityHashCode(this)),
                "“万圣节娱乐演出”主题活动正在进行！"
        );
    }

    @Override
    public void playPrint() {
        System.out.println("\n“万圣节娱乐演出”主题活动正在进行！");
    }
}
