package JiyiCarnival.business.souvenirshop.decorator;
/**
 * @author PinkCrow007
 * 基础挂饰类
 */
public class BasicLogo extends Ornament  {
    public BasicLogo() {
       pattern="---TONGJI--";
    }

    @Override
    public int cost() {
        return 15;
    }

}
