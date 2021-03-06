package JiyiCarnival.interpreter;

import JiyiCarnival.Output;
import JiyiCarnival.service.ticketprice.interpreter.*;
//import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class InterpreterTest extends TestCase
{
    @Test
    public void test()
    {
        System.out.println("解释器模式测试：");
//        System.out.println("济忆嘉年华门票成人票188元，儿童票128元。夏日狂欢满三张减立减90元！");
//        System.out.println("勤勤带着16岁的表弟和他的两位大学室友一起来到售票处购买门票……");

        Expression firstNum = new TerminalExpressionNumber(188),
                secondNum = new TerminalExpressionNumber(3),
                thirdNum = new TerminalExpressionNumber(90),
                forthNum = new TerminalExpressionNumber(128);

        Expression finalResult = new Add(new Minus(new Multiply(firstNum, secondNum), thirdNum), forthNum);
        int result = finalResult.interpret();
        Output.output(this.getClass().toString(),
                "test",
                String.valueOf(System.identityHashCode(this)),
                "所需要付的总票价为" + finalResult.interpret() + "元。"
        );
//        System.out.println("所需要付的总票价为" + finalResult.interpret() + "元。");
    }
}
