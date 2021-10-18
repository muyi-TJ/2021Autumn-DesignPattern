package JiyiCarnival.eventqueue;

import JiyiCarnival.base.broadcast.eventqueue.*;
import org.junit.Test;

public class EventQueueTest {
    @Test
    public void test() {
        Broadcast broadcast = new Broadcast();
        broadcast.init();
        broadcast.addMessage(new Message("AJTBXL"));
        broadcast.addMessage(new Message("ajtbxl"));
        broadcast.addMessage(new Message("安江涛别学了"));
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
