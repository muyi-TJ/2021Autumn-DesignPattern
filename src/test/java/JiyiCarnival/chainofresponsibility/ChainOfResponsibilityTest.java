package JiyiCarnival.chainofresponsibility;

import JiyiCarnival.entertainment.waterslide.chainofresponsibility.ChainOfResponsibility;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.Request;
import JiyiCarnival.entertainment.waterslide.chainofresponsibility.SlideHandler;
//import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("责任链模式测试：");
        SlideHandler slideChain = ChainOfResponsibility.getChainOfSlide();
        int[] steps = new int[]{1, 2, 3, 4};
        for (int step : steps)
        {
            slideChain.handleRequest(new Request(step));
        }
    }
}
