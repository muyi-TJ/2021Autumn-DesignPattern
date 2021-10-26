package JiyiCarnival.entertainment.facilityspecification.specification;

/**
 * @author swaychen0420
 * 判断当前游客年龄是否小于指定年龄
 */

public class VisitorAgeSpecification extends CompositeSpecification<Visitor>{
    private int age;
    public VisitorAgeSpecification(int age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor) {

        boolean res = visitor.getAge() >= age;

        String msg = res ?
                visitor.getName() + "通过当前年龄下限规约, " + visitor.getName() + "年龄大于等于" + age :
                visitor.getName() + "未通过前年龄下限规约, " + visitor.getName() + "年龄小于" + age;

        System.out.println(msg);
        return res;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
