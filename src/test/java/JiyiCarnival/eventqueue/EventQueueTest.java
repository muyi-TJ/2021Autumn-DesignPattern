package JiyiCarnival.eventqueue;

import JiyiCarnival.base.broadcast.eventqueue.*;
import org.junit.Test;

public class EventQueueTest {
    @Test
    public void test() {
        System.out.println("\n事件队列模式测试:");
        Broadcast broadcast = new Broadcast();
        broadcast.init();
        broadcast.addMessage(new Message("欢迎来到济忆嘉年华"));
        broadcast.addMessage(new Message("带小孩的游客请看管好自己的孩子"));
        broadcast.addMessage(new Message("园区花车因天气原因暂时停止运行，不便之处，敬请谅解"));
        while (broadcast.isRunning()) {
            // Wait until all messages are announced
        }
        try {
            broadcast.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("广播站结束播报");
        }
    }
}
