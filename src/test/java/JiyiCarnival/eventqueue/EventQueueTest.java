package JiyiCarnival.eventqueue;

import JiyiCarnival.base.broadcast.eventqueue.Broadcast;
import JiyiCarnival.base.broadcast.eventqueue.Message;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class EventQueueTest
{
    @Test
    public void test() throws InterruptedException
    {
        System.out.println("事件队列模式测试:");
        System.out.println("广播站开始播报");
        Broadcast broadcast = new Broadcast(0);
        broadcast.init();
        broadcast.addMessage(new Message("欢迎来到济忆嘉年华"));
        broadcast.addMessage(new Message("带小孩的游客请看管好自己的孩子"));
        broadcast.addMessage(new Message("园区花车因天气原因暂时停止运行，不便之处，敬请谅解"));
        Thread.sleep(500);
        broadcast.stop();
        System.out.println("广播站结束播报");
    }
}
