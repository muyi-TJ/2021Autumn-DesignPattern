package JiyiCarnival.service.ticketPrice.interpreter;

/**
 * @author swaychen0420
 * 解析两个数的除法
 */

public class Divide implements Expression{
    private Expression leftData,rightData;

    public Divide(Expression leftData, Expression rightData){
        this.leftData=leftData;
        this.rightData=rightData;
    }

    @Override
    public int interpret(){
//        System.out.println("解释器当前正在解析两个数除法的结果…");
        int right = this.rightData.interpret();
        if (right != 0) {
//            System.out.println("当前结果为" + leftData.interpret() / rightData.interpret() + ".");
            return leftData.interpret() / rightData.interpret();
        }
        return -1;
    }
}
