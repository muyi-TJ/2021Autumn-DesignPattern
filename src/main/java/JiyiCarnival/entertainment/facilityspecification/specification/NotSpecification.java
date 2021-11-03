package JiyiCarnival.entertainment.facilityspecification.specification;

/**
 * @author swaychen0420
 * 原规约进行not操作后产生的规约
 */

public class NotSpecification<T> extends CompositeSpecification<T>
{
    private final Specification<T> specification;

    public NotSpecification(Specification<T> specification)
    {
        this.specification = specification;
    }

    @Override
    public boolean isSatisfiedBy(T item)
    {
        boolean res = !specification.isSatisfiedBy(item);
//        String msg = res ?
//                "满足当前‘否’规约" :
//                "不满足当前'否'规约";
//
//        System.out.println(msg);
        return res;
    }
}
