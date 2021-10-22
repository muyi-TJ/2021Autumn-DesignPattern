package JiyiCarnival.chainofresponsibility;

import JiyiCarnival.entertainment.waterslide.chainofresponsibility.*;
import org.junit.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class ChainOfResponsibilityTest {
    @Test
    public void test(){
        System.out.println("责任链模式测试：");
        SlideHandler slideChain = ChainOfResponsibility.getChainOfSlide();
        int[] correctSteps = new int[]{1,2,3,4};
        int[] wrongSteps = new int[]{4,3,2,1};
        for(int step:correctSteps){
            System.out.println("Request step:" + step);
            slideChain.handleRequest(new Request(step));
            System.out.println("---------------");
        }

    }
}
