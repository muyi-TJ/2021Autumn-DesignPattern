package JiyiCarnival.converter;

import JiyiCarnival.base.ticketing.converter.Converter;
import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.base.ticketing.converter.VisitorConverter;
import JiyiCarnival.util.visitor.Gender;
import JiyiCarnival.util.visitor.Visitor;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

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
        Visitor visitor1 = converter.dto2entity(ticket1);
        visitor1.logInfomation();
        // 使门票的入园时间有所区别
        Thread.sleep(1000);
        // visitor -> ticket
        Visitor visitor2 = new Visitor("游乐园", "987654321123456789", 81, Gender.MALE, 180);
        Ticket ticket2 = converter.entity2dto(visitor2);
        ticket2.logInfomation();



    }
}
