package JiyiCarnival.entertainment.activate.Template.activates;

import JiyiCarnival.Output;
import JiyiCarnival.entertainment.activate.Template.ActivateTemplate;

/**
 * @author ajt
 * “生日礼遇”主题活动
 */
public class BirthdayActivate extends ActivateTemplate {
    @Override
    public void play() {
        Output.output(
                this.getClass().toString(),
                "play",
                String.valueOf(System.identityHashCode(this)),
                "“生日礼遇”主题活动正在进行！"
        );
    }
}
