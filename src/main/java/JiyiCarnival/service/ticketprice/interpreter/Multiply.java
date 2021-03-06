package JiyiCarnival.service.ticketprice.interpreter;

/**
 * @author swaychen0420
 * 解析两个数的乘法
 */

public class Multiply implements Expression
{
    private Expression leftData, rightData;

    public Multiply(Expression leftData, Expression rightData)
    {
        this.leftData = leftData;
        this.rightData = rightData;
    }

    @Override
    public int interpret()
    {
        //System.out.println("解释器当前正在解析两个数乘法的结果…");

        //System.out.println("当前结果为"+leftData.interpret() * rightData.interpret()+".");
        return leftData.interpret() * rightData.interpret();
    }
}
