package JiyiCarnival.service.securitycheck.facade;

import JiyiCarnival.Output;

/**
 * @author Caviar011230
 * 个人随身物品（背包等）的检查
 */
public class PersonalBelongingCheck
{
    /**
     * 个人随身物品检查
     */
    public void checkPersonalBelongings()
    {
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "对游客的背包等个人随身物品进行了检查"
        );
    }
}
