package JiyiCarnival.business.souvenirshop.decorator;
/**
 *@author PinkCrow007
 * 校庆赠品装饰者实体类
 */
public class AnniversaryGift extends SouvenirShopDecorator{
    public AnniversaryGift(SouvenirShop shop) {
        super(shop);
    }
    @Override
    public void PrintPolicy(){
        shop.PrintPolicy();
        System.out.println("校庆期间赠送同济樱花徽章！");
    }
}
