package JiyiCarnival.business.hotel.callback;

public class UnsubscribeControl {
    public void flowControl() throws InterruptedException {
        ResultExporter resultExporter = new ResultExporter("play");
        TouristThread touristThread = new TouristThread("play");
        touristThread.run(resultExporter);
    }
}
