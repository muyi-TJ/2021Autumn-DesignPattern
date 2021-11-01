package JiyiCarnival.business.souvenirshop.decorator;

import JiyiCarnival.Output;

/**
 *@author PinkCrow007
 * 纪念品商店政策类（接口实体）
 */
public class SouvenirShopPolicy implements SouvenirShop {
    @Override
    public void printPolicy(){
        Output.output(this.getClass().toString(),
                "printPolicy",
                String.valueOf(System.identityHashCode(this)),
                "播报：欢迎来到济忆纪念品商店！"
        );
    }
}
