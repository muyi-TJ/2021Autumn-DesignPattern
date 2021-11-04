package JiyiCarnival.entertainment.facilityspecification.specification;

import JiyiCarnival.Output;
import JiyiCarnival.util.visitor.Gender;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author swaychen0420
 * 判断游客是否满足性别要求的规约
 */

public class VisitorGenderSpecification extends CompositeSpecification<Visitor>
{
    private Gender gender;

    public VisitorGenderSpecification(Gender gender)
    {
        this.gender = gender;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor)
    {

        boolean res = visitor.getGender() == gender;

        String msg = res ?
//                visitor.getName() + "通过当前性别规约, " +
                        visitor.getName() + "性别为" + gender :
//                visitor.getName() + "未通过当前性别规约, " +
                        visitor.getName() + "性别为" + gender;

//        System.out.println(msg);
//        Output.output(this.getClass().toString(),
//                "isSatisfiedBy",
//                String.valueOf(System.identityHashCode(this)),
//                msg
//        );
        System.out.println(msg);
        return res;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }
}
