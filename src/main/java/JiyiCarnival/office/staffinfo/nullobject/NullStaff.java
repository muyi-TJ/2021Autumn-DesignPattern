package JiyiCarnival.office.staffinfo.nullobject;

/**
 * @author muyi
 * 空工作人员类
 */
public class NullStaff extends AbstractStaff
{
    NullStaff(String name)
    {
        this.name=name;
    }
    @Override
    public boolean isNull()
    {
        return true;
    }

    @Override
    public String getInfo()
    {
        return name+" 查无此人";
    }
}
