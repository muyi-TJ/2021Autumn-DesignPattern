package JiyiCarnival.state;

import JiyiCarnival.entertainment.animalshow.state.*;
import junit.framework.TestCase;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

/**
 * @author Zong
 */
public class StateTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("状态模式测试：");
        AnimalShow animalShow = new AnimalShow();

        //开始表演
        BeginShowState beginShowState = new BeginShowState();
        beginShowState.doAction(animalShow);


        //表演成功
        SucceedState succeedState = new SucceedState();
        succeedState.doAction(animalShow);

        //表演失败
        FailState failState = new FailState();
        failState.doAction(animalShow);


        //表演结束
        EndShowState endShowState = new EndShowState();
        endShowState.doAction(animalShow);

    }

}
