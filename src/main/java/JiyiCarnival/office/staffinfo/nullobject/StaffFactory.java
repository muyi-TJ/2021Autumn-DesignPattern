package JiyiCarnival.office.staffinfo.nullobject;

import java.util.Arrays;

/**
 * @author muyi
 * 员工工厂类
 */
public class StaffFactory
{
    private static String[] names = {"doinb", "junjia", "chovy", "余霜"};


    /**
     * 获取员工
     *
     * @param name 员工名称
     * @return 真实员工或空员工
     */
    public static AbstractStaff getStaff(String name)
    {
        if (Arrays.asList(names).contains(name))
        {
            return new RealStaff(name);
        }
        else
        {
            return new NullStaff(name);
        }
    }
}
