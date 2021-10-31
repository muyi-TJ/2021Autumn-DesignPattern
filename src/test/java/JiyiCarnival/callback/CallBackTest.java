package JiyiCarnival.callback;

import JiyiCarnival.business.hotel.callback.ResultExporter;
import JiyiCarnival.business.hotel.callback.TouristThread;
import org.junit.Test;

public class CallBackTest {
    @Test
    public void testCallBack(){
        ResultExporter resultExporter = new ResultExporter();
        TouristThread touristThread = new TouristThread();
        touristThread.run(resultExporter);
    }
}
