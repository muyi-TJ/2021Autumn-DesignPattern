package JiyiCarnival.business.souvenirshop.decorator;

import JiyiCarnival.Output;

/**
 *@author PinkCrow007
 * 校庆赠品装饰者实体类
 */
public class AnniversaryGift extends SouvenirShopDecorator{
    public AnniversaryGift(SouvenirShop shop) {
        super(shop);
    }

    /**
     * 打印校庆优惠政策：赠送同济樱花徽章
     */
    private void printAnniversaryPolicy(){
        Output.output(this.getClass().toString(),
                "printAnniversaryolicy",
                String.valueOf(System.identityHashCode(this)),
                "校庆期间赠送同济樱花徽章！"
        );
    }
    @Override
    public void printPolicy(){
        shop.printPolicy();
        printAnniversaryPolicy();
    }
}
