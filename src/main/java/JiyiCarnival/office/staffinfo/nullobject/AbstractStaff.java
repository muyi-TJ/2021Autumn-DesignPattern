package JiyiCarnival.office.staffinfo.nullobject;


import JiyiCarnival.Output;

/**
 * @author muyi
 * 抽象工作人员类
 */
public abstract class AbstractStaff
{
    protected String name;

    /**
     * 空对象判定函数
     *
     * @return 是否为空
     */
    public abstract boolean isNull();

    /**
     * 获取员工信息
     *
     * @return 员工信息
     */
    protected abstract String getInfo();

    /**
     * 仅用于规格化输出
     * 实际执行的是getInfo，用于在基类内避免重写
     */
    public void outPut()
    {
        Output.output(this.getClass().toString(),
                "getInfo",
                String.valueOf(System.identityHashCode(this)),
                this.getInfo()
        );
    }

    /**
     * 用于规格化输出 游乐园模式
     * 实际执行的是getInfo，用于在基类内避免重写
     */
    public void infoPrint()
    {
        System.out.println(this.getInfo());
    }
}
