package JiyiCarnival.base.ticketing.converter;

import java.util.Date;
import java.util.function.Function;

/**
 * @author WKATZZL
 * 继承于Converer 用于Visitor和Ticket的转换器类
 */

public class VisitorConverter extends Converter<Ticket, Visitor>{

    /**
     * 构造函数
     */
    public VisitorConverter() {
        super(new ticketDto(), new visitorEntity());
    }

    /**
     * ticketDto类
     */
    public static class ticketDto implements Function<Ticket, Visitor> {
        /**
         * 将Ticket对象转换为Visitor对象
         * @param ticket 门票
         * @return 转换后的Visitor对象
         */
        @Override
        public Visitor apply(Ticket ticket) {
            // 转换
            Visitor visitor = new Visitor();
            visitor.setName(ticket.getName());
            visitor.setAge(ticket.getAge());
            visitor.setGender(ticket.getGender());
            visitor.setID(ticket.getID());
            return visitor;
        }
    }

    /**
     * visitorEntity类
     */
    public static class visitorEntity implements Function<Visitor, Ticket> {
        /**
         * 将Visitor对象转换为Ticket对象
         * @param visitor 游客
         * @return 转换后的Ticket对象
         */
        @Override
        public Ticket apply(Visitor visitor) {
            // 转换
            Ticket ticket = new Ticket();
            ticket.setName(visitor.getName());
            ticket.setAge(visitor.getAge());
            ticket.setGender(visitor.getGender());
            ticket.setID(visitor.getID());
            ticket.setDate(new Date());
            return ticket;
        }
    }

}
