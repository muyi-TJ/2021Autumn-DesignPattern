package JiyiCarnival.business.souvenirshop.decorator;
/**
 * @author PinkCrow007
 * 菱形装饰类
 */
public class DiamondDecorator extends Decorator {
    Ornament ornament;
    public DiamondDecorator(Ornament ornament) {
        this.ornament=ornament;
    }

    @Override
    public int cost(){
        return ornament.cost()+2;
    }


    @Override
    public String getPattern() {
        return ornament.getPattern()+"♦-";
    }


}
