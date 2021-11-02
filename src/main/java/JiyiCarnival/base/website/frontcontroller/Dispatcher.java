package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author Zong
 * 网页调度器，用于分配请求
 */
public class Dispatcher
{
    private HomeView homeView;
    private HelpView helpView;
    private BuyTicketView buyTicketView;
    private RecruitView recruitView;

    /**
     * Dispatcher构造器
     */
    public Dispatcher()
    {
        homeView = new HomeView();
        helpView = new HelpView();
        buyTicketView = new BuyTicketView();
        recruitView = new RecruitView();
    }

    /**
     * 获取请求相应页面 测试模式
     *
     * @param request 请求
     */
    public void dispatch(String request)
    {
        String text = "正在展示页面： " + request;
        Output.output(
                this.getClass().toString(),
                "dispatch",
                String.valueOf(System.identityHashCode(this)),
                text
        );
        if (request.equalsIgnoreCase("HOME"))
        {
            homeView.show();
        }
        else if (request.equalsIgnoreCase("HELP"))
        {
            helpView.show();
        }
        else if (request.equalsIgnoreCase("TICKET"))
        {
            buyTicketView.show();
        }
        else if (request.equalsIgnoreCase("RECRUIT"))
        {
            recruitView.show();
        }
    }


    /**
     * 获取请求相应页面 游乐园模式
     *
     * @param request 请求
     */
    public void dispatchUserRequest(String request) throws InterruptedException {
        String text = "正在展示页面： " + request;
        if (request.equalsIgnoreCase("HOME"))
        {
            homeView.view();
        }
        else if (request.equalsIgnoreCase("HELP"))
        {
            helpView.view();
        }
        else if (request.equalsIgnoreCase("TICKET"))
        {
            buyTicketView.view();
        }
        else if (request.equalsIgnoreCase("RECRUIT"))
        {
            recruitView.view();
        }
    }


}
