package JiyiCarnival.business.foodstand.factory;

import JiyiCarnival.Output;

/**
 *@author Caviar011230
 * 可乐类
 */
public class Coke implements Snack{
    @Override
    public void get(){
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "制作出了一杯可乐"
        );
    }
}
