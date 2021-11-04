package JiyiCarnival.nullobject;

import JiyiCarnival.office.staffinfo.nullobject.AbstractStaff;
import JiyiCarnival.office.staffinfo.nullobject.StaffFactory;
import junit.framework.TestCase;
import org.junit.Test;


public class NullObjectTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("空对象模式测试：");
        String[] names = {"doinb", "clearlove7", "junjia", "faker", "chovy", "余霜"};
        AbstractStaff[] staffs = new AbstractStaff[names.length];

        for (int i = 0; i < names.length; i++)
        {
            staffs[i] = StaffFactory.getStaff(names[i]);
        }
        for (AbstractStaff staff : staffs)
        {
            staff.outPut();
        }

    }
}
