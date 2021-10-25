package JiyiCarnival.converter;

import JiyiCarnival.base.ticketing.converter.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ConverterTest {


    @Test
    public void test() throws InterruptedException {
        System.out.println("转换器模式测试：");

        // 单量转化测试
        System.out.println("\n单量转化");
        Converter<Ticket, Visitor> converter = new VisitorConverter();
        // ticket -> visitor
        System.out.println("门票转换为游客");
        Ticket ticket1 = new Ticket("济忆", "123456789987654321", 18, "男");
        ticket1.printInfomation();
        Visitor visitor1 =  converter.dto2entity(ticket1);
        visitor1.printInfomation();

        // 使门票的入园时间有所区别
        Thread.sleep(1000);

        // visitor -> ticket
        System.out.println("游客转换为门票");
        Visitor visitor2 = new Visitor("游乐园", "987654321123456789", 81, "男");
        visitor2.printInfomation();
        Ticket ticket2 = converter.entity2dto(visitor2);
        ticket2.printInfomation();


        // 批量转化测试
        System.out.println("\n批量转化");
        System.out.println("门票批量转化为游客");
        List<Ticket> tickets = new ArrayList<>();
        ticket1 = new Ticket("忆济", "123456789987654321", 18, "女");
        Thread.sleep(1000);
        ticket2 = new Ticket("园乐游", "987654321123456789", 81, "女");
        tickets.add(ticket1);
        tickets.add(ticket2);
        for(Ticket ticket: tickets){
            ticket.printInfomation();
        }
        List<Visitor> visitors = converter.dtos2entities(tickets);
        for (Visitor visitor: visitors) {
            visitor.printInfomation();
        }

        visitors.clear();

        System.out.println("游客批量转化为门票");
        visitor1 = new Visitor("忆济", "123456789987654321", 18, "女");
        visitor2 = new Visitor("园乐游", "987654321123456789", 81, "女");
        visitors.add(visitor1);
        visitors.add(visitor2);
        for (Visitor visitor: visitors) {
            visitor.printInfomation();
        }
        tickets = converter.entities2dtos(visitors);

        for(Ticket ticket: tickets){
            ticket.printInfomation();
        }


    }
}
