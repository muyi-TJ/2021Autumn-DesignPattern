package JiyiCarnival.business.souvenirshop.decorator;
/**
 *@author PinkCrow007
 * 毕业生折扣装饰者实体类
 */
public class GraduatesDiscount extends SouvenirShopDecorator {
    public GraduatesDiscount(SouvenirShop shop) {
        super(shop);
    }

    @Override
    public void PrintPolicy(){
        shop.PrintPolicy();
        System.out.println("毕业生一律打5折！");
    }
}
