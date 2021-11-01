package JiyiCarnival.business.souvenirshop.decorator;

/**
 * @author PinkCrow007
 * 纪念品商店抽象装饰器类
 */
public class SouvenirShopDecorator implements SouvenirShop
{
    protected SouvenirShop shop;

    public SouvenirShopDecorator(SouvenirShop shop)
    {
        this.shop = shop;
    }

    /**
     * 展示商店购买政策
     */
    public void printPolicy()
    {
        shop.printPolicy();
    }
}
