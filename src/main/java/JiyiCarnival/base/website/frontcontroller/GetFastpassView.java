package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 创建领取FP视图类
 */
public class GetFastpassView
{
    /**
     * 展示领取FP视图
     */
    public void show()
    {
        String text = "在这里领取Fastpass快速通行证，避开漫长的排队等候时间！";
        Output.output(
                this.getClass().toString(),
                "show",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }
}
