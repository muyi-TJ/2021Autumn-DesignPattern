package JiyiCarnival.entertainment.facilityspecification.specification;

import JiyiCarnival.Output;

/**
 * @author swaychen0420
 * 原规约进行链式操作or后产生的规约
 */

public class OrSpecification<T> extends CompositeSpecification<T>{
    private final Specification<T> specification1;
    private final Specification<T> specification2;

    public OrSpecification(Specification<T> specification1, Specification<T> specification2) {
        this.specification1 = specification1;
        this.specification2 = specification2;
    }
    @Override
    public boolean isSatisfiedBy(T item) {
        boolean res = specification1.isSatisfiedBy(item) || specification2.isSatisfiedBy(item);
        String msg = res ?
                "满足当前‘或’规约":
                "不满足当前'或'规约";

//        System.out.println(msg);
        Output.output(this.getClass().toString(),
                "isSatisfiedBy",
                String.valueOf(System.identityHashCode(this)),
                msg
        );
        return res;
    }
}
