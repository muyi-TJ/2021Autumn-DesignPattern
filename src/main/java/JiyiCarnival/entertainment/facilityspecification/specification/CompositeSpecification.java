package JiyiCarnival.entertainment.facilityspecification.specification;

/**
 * @author swaychen0420
 * 组合规约，可以进行and/or/not操作
 */

public abstract class CompositeSpecification<T> implements Specification<T>{
    @Override
    public abstract boolean isSatisfiedBy(T item);

    @Override
    public Specification<T> and(Specification<T> specification) {
        return new AndSpecification<T>(this, specification);
    }

    @Override
    public Specification<T> or(Specification<T> specification) {
        return new OrSpecification<T>(this, specification);
    }

    @Override
    public Specification<T> not() {
        return new NotSpecification<T>(this);
    }
}
