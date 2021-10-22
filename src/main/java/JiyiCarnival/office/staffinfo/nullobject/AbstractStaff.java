package JiyiCarnival.office.staffinfo.nullobject;


/**
 * @author muyi
 * 抽象工作人员类
 */
public abstract class AbstractStaff
{
    protected String name;

    /**
     * 空对象判定函数
     * @return 是否为空
     */
    public abstract boolean isNull();

    /**
     * 获取员工信息
     * @return 员工信息
     */
    public abstract String getInfo();

}
