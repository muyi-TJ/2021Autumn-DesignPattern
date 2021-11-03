package JiyiCarnival.business.souvenirshop.decorator;
/**
 * @author PinkCrow007
 * 圆形装饰类
 */
public class CircleDecorator extends Decorator {
    Ornament ornament;
    public CircleDecorator(Ornament ornament) {
        this.ornament=ornament;
    }

    @Override
    public int cost(){
        return ornament.cost()+2;
    }


    @Override
    public String getPattern() {
        return ornament.getPattern()+"●-";
    }
}
