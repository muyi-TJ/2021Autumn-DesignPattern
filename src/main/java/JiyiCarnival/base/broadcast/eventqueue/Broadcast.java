package JiyiCarnival.base.broadcast.eventqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author potassiummmm
 * 广播站类
 * 创建线程处理广播消息队列
 */

public class Broadcast {
    private volatile Thread updateThread = null;

    private final Queue<Message> pendingMessages;

    public Broadcast() {
        this.pendingMessages = new LinkedList<>();
    }

    public void init() {

        if (updateThread == null) {
            updateThread = new Thread(() -> {
                while (!Thread.currentThread().isInterrupted()) {
                    update();
                }
            });
        }
        startThread();
    }

    private synchronized void startThread() {
        if (!updateThread.isAlive()) {
            updateThread.start();
        }
    }

    public synchronized void stop() throws InterruptedException {
        if (updateThread != null) {
            updateThread.interrupt();
        }
        updateThread.join();
        updateThread = null;
    }

    public synchronized void addMessage(Message m) {
        init();
        pendingMessages.add(m);
    }

    private void update() {
        if (pendingMessages.isEmpty()) {
            return;
        }
        System.out.println("广播信息:" + pendingMessages.poll());
    }
}
