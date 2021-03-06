package JiyiCarnival.entertainment.facilityspecification.specification;

import JiyiCarnival.Output;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author swaychen0420
 * 判断游客身高是否满足身高下限的规约
 */

public class VisitorHeightSpecificationLog extends CompositeSpecification<Visitor>
{
    private double height;

    public VisitorHeightSpecificationLog(double height)
    {
        this.height = height;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor)
    {
        boolean res = visitor.getHeight() >= height;

        String msg = res ?
//                visitor.getName() + "通过当前身高下限规约, " +
                        visitor.getName() + "身高大于等于" + height :
//                visitor.getName() + "未通过当前身高下限规约, " +
                        visitor.getName() + "身高小于" + height;

//        System.out.println(msg);
        Output.output(this.getClass().toString(),
                "isSatisfiedBy",
                String.valueOf(System.identityHashCode(this)),
                msg
        );
//        System.out.println(msg);
        return res;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }
}
