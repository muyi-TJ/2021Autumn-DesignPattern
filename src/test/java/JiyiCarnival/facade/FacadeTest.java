package JiyiCarnival.facade;
/**
 * @author Caviar011230
 * 测试类
 */

import JiyiCarnival.service.securitycheck.facade.SecurityCheckFacade;
import org.junit.Test;

public class FacadeTest
{
    @Test
    public void test()
    {
        SecurityCheckFacade securityCheckFacade = new SecurityCheckFacade();
        System.out.println("外观模式测试：");
        securityCheckFacade.ordinaryCustomerSecurityCheck();
        securityCheckFacade.specialCustomerSecurityCheck();
    }
}
