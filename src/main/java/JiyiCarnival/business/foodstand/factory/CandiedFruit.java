package JiyiCarnival.business.foodstand.factory;

import JiyiCarnival.Output;
/**
 *@author Caviar011230
 * 糖葫芦类
 */

public class CandiedFruit implements Snack {
    /**
     * 获取糖葫芦
     */
    @Override
    public void get() {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "制作出了一根糖葫芦"
        );
    }
}
