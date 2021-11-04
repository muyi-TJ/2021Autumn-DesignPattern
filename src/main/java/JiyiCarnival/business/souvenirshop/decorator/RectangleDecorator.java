package JiyiCarnival.business.souvenirshop.decorator;
/**
 * @author PinkCrow007
 * 矩形装饰类
 */
public class RectangleDecorator extends Decorator {
    Ornament ornament;
    public RectangleDecorator(Ornament ornament) {
        this.ornament=ornament;
    }

    @Override
    public int cost(){
        return ornament.cost()+2;
    }


    @Override
    public String getPattern() {
        return ornament.getPattern()+"◘-";
    }


}
