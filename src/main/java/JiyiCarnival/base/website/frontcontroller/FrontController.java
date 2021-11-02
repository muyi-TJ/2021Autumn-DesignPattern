package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author Zong
 * 前端控制器，统一接收请求
 */
public class FrontController
{
    private Dispatcher dispatcher;

    private boolean isLogin = false;
    /**
     * FrontController构造器
     */
    public FrontController()
    {
        dispatcher = new Dispatcher();
    }

    /**
     * 认证用户身份 测试模式
     */
    private boolean isAuthenticUser()
    {
        String text = "正在认证身份： " + "成功认证用户身份";
        Output.output(
                this.getClass().toString(),
                "authentication",
                String.valueOf(System.identityHashCode(this)),
                text
        );
        return true;
    }

    /**
     * 记录请求页面过程 测试模式
     *
     * @param request 请求
     */
    private void trackRequest(String request)
    {
        String text = "正在请求页面： " + request;
        Output.output(
                this.getClass().toString(),
                "request",
                String.valueOf(System.identityHashCode(this)),
                text
        );
    }

    /**
     * 处理请求流程 测试模式
     *
     * @param request 请求
     */
    public void dispatchRequest(String request)
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


    /**
     * 认证用户身份 游乐园模式
     */
    private boolean userAuthentication() throws InterruptedException {
        System.out.println("正在认证身份");
        for(int i=0; i<6; i++){
            System.out.print('.');
            Thread.sleep(500);
        }
        System.out.println("\n成功认证用户身份");
        return true;
    }

    /**
     * 记录请求页面过程 游乐园模式
     *
     * @param request 请求
     */
    private void userRequest(String request)
    {
        System.out.println("正在请求页面： " + request);
    }

    /**
     * 处理请求流程 游乐园模式
     *
     * @param request 请求
     */
    public void dispatchUserRequest(String request) throws InterruptedException {
        //记录请求
        userRequest(request);
        //校验用户
        if(isLogin){
            dispatcher.dispatchUserRequest(request);
        }
        else
        {
            userAuthentication();
            //处理请求
            isLogin = true;
            dispatcher.dispatchUserRequest(request);
        }
    }



}
