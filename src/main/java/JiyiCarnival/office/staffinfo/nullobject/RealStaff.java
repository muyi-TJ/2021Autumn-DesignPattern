package JiyiCarnival.office.staffinfo.nullobject;

/**
 * @author muyi
 * 真实工作人员类
 */
public class RealStaff extends AbstractStaff
{
    public RealStaff(String name)
    {
        this.name = name;
    }

    @Override
    public boolean isNull()
    {
        return false;
    }

    @Override
    public String getInfo()
    {
        return StaffInfo.getInfo((name));
    }
}
