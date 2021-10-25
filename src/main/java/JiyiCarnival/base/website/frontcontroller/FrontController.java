package JiyiCarnival.base.website.frontcontroller;

/**
 * @author Zong
 * 前端控制器，统一接收请求
 */
public class FrontController
{
    private Dispatcher dispatcher;

    /**
     * FrontController构造器
     */
    public FrontController()
    {
        dispatcher = new Dispatcher();
    }

    /**
     * 认证用户身份
     */
    private boolean isAuthenticUser()
    {
        System.out.println("正在认证身份： " + "成功认证用户身份");
        return true;
    }

    /**
     * 记录请求页面过程
     * @param request 请求
     */
    private void trackRequest(String request)
    {
        System.out.println("正在请求页面： " + request);
    }

    /**
     * 处理请求流程
     * @param request 请求
     */
    public void  dispatchRequest(String request)
    {
        //记录请求
        trackRequest(request);
        //校验用户
        if (isAuthenticUser())
        {
            //处理请求
            dispatcher.dispatch(request);
        }
    }
}
