package JiyiCarnival.base.parkinglot.observer;

import JiyiCarnival.Output;

/**
 * @author PinkCrow007
 * 播报器类
 */
public class Broadcaster implements Observer
{
    private CarDetectMachine DetectMachine;

    public Broadcaster(CarDetectMachine carDetectMachine)
    {
        DetectMachine = carDetectMachine;
    }

    @Override
    public void update(boolean flg)
    {
        if (!DetectMachine.getState())
        {
            Output.output(this.getClass().toString(),
                    "update",
                    String.valueOf(System.identityHashCode(this)),
                    "【播报器】十分抱歉，停车场已满"
            );
            return;
        }
        if (flg)
        {
            Output.output(this.getClass().toString(),
                    "update",
                    String.valueOf(System.identityHashCode(this)),
                    "【播报器】欢迎您来到停车场，祝您游玩愉快!"
            );
        }
        else
        {
            Output.output(this.getClass().toString(),
                    "update",
                    String.valueOf(System.identityHashCode(this)),
                    "【播报器】欢迎您下次再来!"
            );
        }
    }

    @Override
    public void carUpdate(boolean flg){
        if (!DetectMachine.getState())
        {
            System.out.println("播报器：十分抱歉，停车场已满");
            return;
        }
        if (flg)
        {
            System.out.println("播报器：欢迎您来到停车场，祝您游玩愉快!");
        }
        else
        {
            System.out.println("播报器：欢迎您下次再来!");
        }
    }
}
