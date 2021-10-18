package JiyiCarnival.decorator;
/**
 *@author PinkCrow007
 * 装饰器模式测试类
 */
import JiyiCarnival.business.souvenirshop.decorator.AnniversaryGift;
import JiyiCarnival.business.souvenirshop.decorator.GraduatesDiscount;
import JiyiCarnival.business.souvenirshop.decorator.SouvenirShopPolicy;
import org.junit.Test;

public class decoratorTest {
    @Test
    public void test(){
        System.out.println("-------------------");
        System.out.println("装饰器模式测试：");
        System.out.println("-------------------");
        SouvenirShopPolicy souvenirShopPolicy=new SouvenirShopPolicy();
        souvenirShopPolicy.PrintPolicy();
        System.out.println("-------------------");
        GraduatesDiscount freshmanDiscount=new GraduatesDiscount(souvenirShopPolicy);
        freshmanDiscount.PrintPolicy();
        System.out.println("-------------------");
        AnniversaryGift anniversaryGift=new AnniversaryGift(freshmanDiscount);
        anniversaryGift.PrintPolicy();
        System.out.println("-------------------");
    }
}
