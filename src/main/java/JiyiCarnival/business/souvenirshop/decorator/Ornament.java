package JiyiCarnival.business.souvenirshop.decorator;
/**
 * @author PinkCrow007
 * 挂饰类类
 */
public abstract class Ornament {
    String pattern=null;

    /**
     * 获得当前图案
     * @return 当前图案字符串
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * 获得价钱
     * @return 总价格
     */
    public abstract int cost();

}
