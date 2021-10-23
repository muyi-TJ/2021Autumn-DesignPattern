package JiyiCarnival.entertainment.facilityspecification.specification;

/**
 * @author swaychen0420
 * 定义gender数据类型
 */

public enum Gender {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        return this == Gender.FEMALE ? "女" : "男";
    }
}
