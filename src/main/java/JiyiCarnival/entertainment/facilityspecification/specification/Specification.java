package JiyiCarnival.entertainment.facilityspecification.specification;

/**
 * @author swaychen0420
 * 定义规约接口
 */

public interface Specification<T>
{
    //判断是否满足当前规约
    boolean isSatisfiedBy(T t);

    //要满足新规约，需同时满足两个规约
    Specification<T> and(Specification<T> specification);

    //要满足新规约，需满足两个规约中的一个
    Specification<T> or(Specification<T> specification);

    //要满足新规约，需不满足当前规约
    Specification<T> not();
}
