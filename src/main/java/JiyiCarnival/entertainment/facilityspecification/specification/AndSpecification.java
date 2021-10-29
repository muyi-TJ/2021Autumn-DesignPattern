package JiyiCarnival.entertainment.facilityspecification.specification;

/**
 * @author swaychen0420
 * 原规约进行链式操作and后产生的规约
 */

public class AndSpecification<T> extends CompositeSpecification<T> {
    private final Specification<T> specification1;
    private final Specification<T> specification2;

    public AndSpecification(Specification<T> specification1, Specification<T> specification2) {
        this.specification1 = specification1;
        this.specification2 = specification2;
    }
    @Override
    public boolean isSatisfiedBy(T item) {
        boolean res = specification1.isSatisfiedBy(item) && specification2.isSatisfiedBy(item);
        String msg = res ?
                "满足当前‘和’规约":
                "不满足当前'和'规约";
        System.out.println(msg);
        return res;
    }
}
