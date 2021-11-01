package JiyiCarnival.service.ticketprice.interpreter;

/**
 * @author swaychen0420
 * 表达式实体类
 */

public class TerminalExpressionNumber implements Expression
{
    private int data;

    public TerminalExpressionNumber(int data)
    {
        this.data = data;
    }

    @Override
    //返回数据本身
    public int interpret()
    {
        return data;
    }
}
