package JiyiCarnival.frontcontroller;

import JiyiCarnival.base.website.frontcontroller.FrontController;
import junit.framework.TestCase;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

/**
 * @author Zong
 */
public class FrontControllerTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("前端控制器模式测试：");

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("TICKET");
        frontController.dispatchRequest("RECRUIT");
        frontController.dispatchRequest("HELP");
    }
}
