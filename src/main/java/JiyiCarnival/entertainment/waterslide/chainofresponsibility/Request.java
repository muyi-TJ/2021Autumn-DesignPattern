package JiyiCarnival.entertainment.waterslide.chainofresponsibility;

/**
 * @author WKATZZL
 * 处理抽象类
 */
public class Request {
    // 当前请求所属步骤
    private int step;

    /**
     *
     * @param step 设置当前请求的步骤
     */
    public Request(int step){
        this.step = step;
    }

    /**
     *
     * @param step 设置当前请求的步骤
     */
    public void setStep(int step){
        this.step = step;
    }

    /**
     *
     * @return 当前请求的所属步骤
     */
    public int getStep(){
        return this.step;
    }
}
