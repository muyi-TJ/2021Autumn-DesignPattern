package JiyiCarnival.business.souvenirshop.decorator;
/**
 *@author PinkCrow007
 * 纪念品商店政策类（接口实体）
 */
public class SouvenirShopPolicy implements SouvenirShop {
    @Override
    public void PrintPolicy(){
        System.out.println("欢迎来到济忆纪念品商店！");
    }
}
