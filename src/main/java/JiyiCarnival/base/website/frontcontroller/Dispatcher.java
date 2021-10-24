package JiyiCarnival.base.website.frontcontroller;

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
        if (request.equalsIgnoreCase("HOME"))
        {
            System.out.println("展示" + request + "页面：");
            homeView.show();
        }
        else if (request.equalsIgnoreCase("HELP"))
        {
            System.out.println("展示" + request + "页面：");
            helpView.show();
        }
        else if (request.equalsIgnoreCase("TICKET"))
        {
            System.out.println("展示" + request + "页面：");
            buyTicketView.show();
        }
        else if (request.equalsIgnoreCase("FASTPASS"))
        {
            System.out.println("展示" + request + "页面：");
            getFastpassView.show();
        }
    }
}
