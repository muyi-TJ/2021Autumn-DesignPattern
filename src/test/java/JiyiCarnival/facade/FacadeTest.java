package JiyiCarnival.facade;
/**
 * @author Caviar011230
 * 测试类
 */

import JiyiCarnival.service.securitycheck.facade.SecurityCheckFacade;
//import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class FacadeTest extends TestCase
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
