package JiyiCarnival.callback;

import JiyiCarnival.business.hotel.callback.ResultExporter;
import JiyiCarnival.business.hotel.callback.TouristThread;
//import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CallBackTest extends TestCase
{
    @Test
    public void testCallBack() throws InterruptedException {
        System.out.println("回调模式测试：");
        ResultExporter resultExporter = new ResultExporter();
        TouristThread touristThread = new TouristThread();
        touristThread.run(resultExporter);
    }
}
