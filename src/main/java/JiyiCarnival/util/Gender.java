package JiyiCarnival.util;

public enum Gender{
    MALE,
    FEMALE;
    @Override
    public String toString()
    {
        return this == Gender.FEMALE ? "女" : "男";
    }
}