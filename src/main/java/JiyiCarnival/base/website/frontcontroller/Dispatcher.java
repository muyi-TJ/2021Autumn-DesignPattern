package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.Output;

/**
 * @author Zong
 * 网页调度器，用于分配请求
 */
public class Dispatcher
{
    private HomeView homeView;
    private HelpView helpView;
    private BuyTicketView buyTicketView;
    private GetFastpassView getFastpassView;

    /**
     * Dispatcher构造器
     */
    public Dispatcher()
    {
        homeView = new HomeView();
        helpView = new HelpView();
        buyTicketView = new BuyTicketView();
        getFastpassView = new GetFastpassView();
    }

    /**
     * 获取请求相应页面
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
        else if (request.equalsIgnoreCase("FASTPASS"))
        {
            getFastpassView.show();
        }
    }
}
