package JiyiCarnival.decorator;
/**
 * @author PinkCrow007
 * 装饰器模式测试类
 */

import JiyiCarnival.Output;
import JiyiCarnival.business.souvenirshop.decorator.BasicLogo;
import JiyiCarnival.business.souvenirshop.decorator.CircleDecorator;
import JiyiCarnival.business.souvenirshop.decorator.DiamondDecorator;
import JiyiCarnival.business.souvenirshop.decorator.RectangleDecorator;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class decoratorTest
{
    @Test
    public void test()
    {
        System.out.println("装饰器模式测试:");
        BasicLogo basicLogo=new BasicLogo();
        Output.output(
                this.getClass().toString(),
                "test",
                String.valueOf(System.identityHashCode(this)),
                "挂饰："+basicLogo.getPattern()
        );
        Output.output(
                this.getClass().toString(),
                "test",
                String.valueOf(System.identityHashCode(this)),
                "价格："+basicLogo.cost()+"元"
        );
        CircleDecorator circleDecorator=new CircleDecorator(basicLogo);
        Output.output(
                this.getClass().toString(),
                "test",
                String.valueOf(System.identityHashCode(this)),
                "挂饰："+circleDecorator.getPattern()
        );
        Output.output(
                this.getClass().toString(),
                "test",
                String.valueOf(System.identityHashCode(this)),
                "价格："+circleDecorator.cost()+"元"
        );
        RectangleDecorator rectangleDecorator=new RectangleDecorator(circleDecorator);
        Output.output(
                this.getClass().toString(),
                "test",
                String.valueOf(System.identityHashCode(this)),
                "挂饰："+rectangleDecorator.getPattern()
        );
        Output.output(
                this.getClass().toString(),
                "test",
                String.valueOf(System.identityHashCode(this)),
                "价格："+rectangleDecorator.cost()+"元"
        );
        DiamondDecorator diamondDecorator=new DiamondDecorator(rectangleDecorator);
        Output.output(
                this.getClass().toString(),
                "test",
                String.valueOf(System.identityHashCode(this)),
                "挂饰："+diamondDecorator.getPattern()
        );
        Output.output(
                this.getClass().toString(),
                "test",
                String.valueOf(System.identityHashCode(this)),
                "价格："+diamondDecorator.cost()+"元"
        );

    }
}
