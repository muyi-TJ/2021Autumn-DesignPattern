package JiyiCarnival.facade;
/**
 * @author Caviar011230
 * 测试类
 */

import JiyiCarnival.service.securityCheck.facade.*;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void test(){
        SecurityCheckFacade securityCheckFacade = new SecurityCheckFacade();
        System.out.println("外观模式测试：");
        securityCheckFacade.ordinaryCustomerSecurityCheck();
        securityCheckFacade.specialCustomerSecurityCheck();
    }
}
