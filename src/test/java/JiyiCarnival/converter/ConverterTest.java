package JiyiCarnival.converter;

import JiyiCarnival.base.ticketing.converter.Converter;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.base.ticketing.converter.VisitorConverter;
import JiyiCarnival.util.visitor.Gender;
import JiyiCarnival.util.visitor.Visitor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ConverterTest
{


    @Test
    public void test() throws InterruptedException
    {
        System.out.println("转换器模式测试：");
        // 单量转化测试
        Converter<Ticket, Visitor> converter = new VisitorConverter();
        // ticket -> visitor
        Ticket ticket1 = new Ticket("济忆", "123456789987654321", 18, Gender.MALE);
        ticket1.logInfomation();
        Visitor visitor1 = converter.dto2entity(ticket1);
        visitor1.logInfomation();

        // 使门票的入园时间有所区别
        Thread.sleep(1000);

        // visitor -> ticket
        Visitor visitor2 = new Visitor("游乐园", "987654321123456789", 81, Gender.MALE, 180);
        visitor2.logInfomation();
        Ticket ticket2 = converter.entity2dto(visitor2);
        ticket2.logInfomation();


        // 批量转化测试
        List<Ticket> tickets = new ArrayList<>();
        ticket1 = new Ticket("忆济", "123456789987654321", 18, Gender.FEMALE);
        Thread.sleep(1000);
        ticket2 = new Ticket("园乐游", "987654321123456789", 81, Gender.FEMALE);
        tickets.add(ticket1);
        tickets.add(ticket2);
        for (Ticket ticket : tickets)
        {
            ticket.logInfomation();
        }
        // 门票批量转化为游客
        List<Visitor> visitors = converter.dtos2entities(tickets);
        for (Visitor visitor : visitors)
        {
            visitor.logInfomation();
        }

        visitors.clear();
        visitor1 = new Visitor("忆济", "123456789987654321", 18, Gender.FEMALE, 160);
        visitor2 = new Visitor("园乐游", "987654321123456789", 81, Gender.FEMALE, 160);
        visitors.add(visitor1);
        visitors.add(visitor2);
        for (Visitor visitor : visitors)
        {
            visitor.logInfomation();
        }
        // 游客批量转化为门票
        tickets = converter.entities2dtos(visitors);

        for (Ticket ticket : tickets)
        {
            ticket.logInfomation();
        }


    }
}
