package JiyiCarnival.entertainment.facilityspecification.specification;

import JiyiCarnival.Output;
import JiyiCarnival.util.visitor.Visitor;

public class VisitorAgeSpecificationLog extends CompositeSpecification<Visitor>{
    private int age;

    public VisitorAgeSpecificationLog(int age)
    {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor)
    {

        boolean res = visitor.getAge() >= age;

        String msg = res ?
//                visitor.getName() + "通过当前年龄下限规约, " +
                visitor.getName() + "年龄大于等于" + age :
//                visitor.getName() + "未通过前年龄下限规约, " +
                visitor.getName() + "年龄小于" + age;

//        System.out.println(msg);
        Output.output(this.getClass().toString(),
                "isSatisfiedBy",
                String.valueOf(System.identityHashCode(this)),
                msg
        );
        return res;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
