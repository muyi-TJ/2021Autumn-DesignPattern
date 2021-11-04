package JiyiCarnival.entertainment.movice.flyweight;

import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.util.control.Controller;

public class MovieControl extends Controller {
    private String[] names = {"寻梦环游记", "花木兰", "精灵旅社", "精灵旅社2"};
    public void flowControl() throws InterruptedException {
        Movice movice = new Movice(names);
        movice.play(JiyiCarnival.getVisitor());
    }
}
