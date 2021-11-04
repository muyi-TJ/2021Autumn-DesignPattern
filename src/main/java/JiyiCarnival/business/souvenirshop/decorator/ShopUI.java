package JiyiCarnival.business.souvenirshop.decorator;

import JiyiCarnival.util.control.Controller;
import JiyiCarnival.util.input.Input;
/**
 * @author
 * 充电宝控制类
 */
public class ShopUI extends Controller {
    /**
     * 流程控制
     */
    public void flowControl(){
        System.out.println("欢迎您进入纪念品商店！DIY纪念挂饰正在热卖中，基础款为TONGJI字母挂饰，您可以选择自己喜欢的配件进行装饰！基础款15元，一个配件2元");
        System.out.println("--------------");
        System.out.println("1.白色椰壳 2.菩提果串珠 3.紫檀菱形雕 0.结束制作");
        System.out.println("--------------");
        BasicLogo basicLogo=new BasicLogo();
        Ornament pointer=basicLogo;
        int opt=1;
        while(opt>0){
            opt= Input.input();
            switch(opt){
                case 1:
                    pointer=new CircleDecorator(pointer);
                    break;
                case 2:
                    pointer=new RectangleDecorator(pointer);
                    break;
                case 3:
                    pointer=new DiamondDecorator(pointer);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
            System.out.println("ok");
        }
        System.out.println("挂饰制作好了^_^");
        System.out.println(pointer.getPattern());
        System.out.println("您一共消费："+pointer.cost()+"元，谢谢光临！");
    }
}
