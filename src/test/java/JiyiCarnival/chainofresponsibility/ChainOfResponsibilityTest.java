package JiyiCarnival.chainofresponsibility;

import JiyiCarnival.entertainment.waterslide.chainofresponsibility.*;
import org.junit.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class ChainOfResponsibilityTest {
    @Test
    public void test(){
        System.out.println("责任链模式测试：");
        SlideHandler slideChain = ChainOfResponsibility.getChainOfSlide();
        int[] steps = new int[]{1,2,3,4};
        for(int step:steps)
            slideChain.handleRequest(new Request(step));
    }
}
