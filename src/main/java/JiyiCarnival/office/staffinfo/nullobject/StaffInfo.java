package JiyiCarnival.office.staffinfo.nullobject;

/**
 * @author muyi
 * 模拟数据库查询信息
 */
public class StaffInfo
{
    static public String getInfo(String name)
    {
        if (name.equals("doinb"))
        {
            return "doinb 男 保洁";
        }
        if (name.equals("junjia"))
        {
            return "junjia 男 饮水机管理员";
        }
        if (name.equals("chovy"))
        {
            return "chovy 男 主管";
        }
        if (name.equals("余霜"))
        {
            return "余霜 女 主持人";
        }
        return "";

    }
}
