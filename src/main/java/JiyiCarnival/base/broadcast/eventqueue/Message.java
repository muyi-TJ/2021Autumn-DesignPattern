package JiyiCarnival.base.broadcast.eventqueue;

/**
 * @author potassiummmm
 * 广播信息实体
 * 使用java14的record特性
 */

public record Message(String content)
{

    @Override
    public String toString()
    {
        return content;
    }
}
