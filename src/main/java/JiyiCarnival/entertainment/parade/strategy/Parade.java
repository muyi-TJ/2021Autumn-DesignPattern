package JiyiCarnival.entertainment.parade.strategy;

/**
 * @author Rounds-Chen
 *
 * 游行类
 */
public class Parade {
    private ParadeRoute route;

    public void setRoute(ParadeRoute route) {
        this.route = route;
    }

    public void parade(){
        this.route.parade();
    }
}
