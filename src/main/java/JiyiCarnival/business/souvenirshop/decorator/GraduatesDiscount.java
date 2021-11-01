package JiyiCarnival.business.souvenirshop.decorator;

import JiyiCarnival.Output;

/**
 *@author PinkCrow007
 * 毕业生折扣装饰者实体类
 */
public class GraduatesDiscount extends SouvenirShopDecorator {
    public GraduatesDiscount(SouvenirShop shop) {
        super(shop);
    }
    /**
     * 打印毕业生优惠政策：打 5 折
     */
    private void printGraduatesDiscount(){
        Output.output(this.getClass().toString(),
                "printGraduatesDiscount",
                String.valueOf(System.identityHashCode(this)),
                "毕业生一律打5折！"
        );
    }
    @Override
    public void printPolicy(){
        shop.printPolicy();
        printGraduatesDiscount();
    }
}
