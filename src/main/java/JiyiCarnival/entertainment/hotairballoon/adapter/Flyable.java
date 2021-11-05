package JiyiCarnival.entertainment.hotairballoon.adapter;

import java.io.IOException;

/**
 * @author WKATZZL
 * 能够飞翔的接口类
 */
public interface Flyable
{
    /**
     * 飞翔
     */
    void flyLog();
    void fly() throws IOException, InterruptedException;
}
