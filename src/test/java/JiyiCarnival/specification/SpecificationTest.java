package JiyiCarnival.specification;

import JiyiCarnival.entertainment.facilityspecification.specification.*;
import org.junit.Test;

public class SpecificationTest {
    @Test
    public void test(){
        System.out.println("规约模式测试：");

        Visitor[] visitors = {
                new Visitor("yyzjj").setAge(12).setHeight(120).setGender(Gender.FEMALE),
                new Visitor("xygg").setAge(21).setHeight(200).setGender(Gender.MALE),
                new Visitor("czyjj").setAge(18).setHeight(169).setGender(Gender.FEMALE),
        };

//        System.out.println("【规约检测】（请参照每位测试对象最后一条检测结果>>");
//        System.out.println("loading......");
        Specification<Visitor> specificationOne = new VisitorGenderSpecification(Gender.FEMALE).and(new VisitorAgeSpecification(14));
        Specification<Visitor> specificationTwo = new VisitorHeightSpecification(170).or(new VisitorGenderSpecification(Gender.FEMALE));
        Specification<Visitor> specificationThree = new VisitorAgeSpecification(18).and(new VisitorAgeSpecification(80).not());

//        System.out.println("规约检测-------------------1----------------------");
        specificationOne.isSatisfiedBy(visitors[0]);
//        System.out.println("规约检测-------------------2----------------------");
        specificationTwo.isSatisfiedBy(visitors[1]);
//        System.out.println("规约检测-------------------3----------------------");
        specificationThree.isSatisfiedBy(visitors[2]);
    }
}
