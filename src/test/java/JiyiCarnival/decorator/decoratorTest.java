package JiyiCarnival.decorator;
/**
 * @author PinkCrow007
 * 装饰器模式测试类
 */

import JiyiCarnival.business.souvenirshop.decorator.AnniversaryGift;
import JiyiCarnival.business.souvenirshop.decorator.GraduatesDiscount;
import JiyiCarnival.business.souvenirshop.decorator.SouvenirShopPolicy;
import org.junit.Test;

public class decoratorTest
{
    @Test
    public void test()
    {
        System.out.println("装饰器模式测试：");
        //System.out.println("【平时】");
        SouvenirShopPolicy souvenirShopPolicy = new SouvenirShopPolicy();
        souvenirShopPolicy.printPolicy();
        //System.out.println("【同济114周年校庆期间】");
        AnniversaryGift anniversaryGift = new AnniversaryGift(souvenirShopPolicy);
        anniversaryGift.printPolicy();
        //System.out.println("【校庆还未结束，毕业季也临近了】");
        GraduatesDiscount freshmanDiscount = new GraduatesDiscount(anniversaryGift);
        freshmanDiscount.printPolicy();

    }
}
