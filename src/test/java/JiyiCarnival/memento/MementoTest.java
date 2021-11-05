package JiyiCarnival.memento;

import JiyiCarnival.entertainment.shooting.memento.RecordCaretaker;
import JiyiCarnival.entertainment.shooting.memento.RecordOriginator;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class MementoTest
{

    @Test
    public void testMemento()
    {
        System.out.println("备忘录模式测试：");
        RecordOriginator ori = new RecordOriginator();
        RecordCaretaker careTaker = new RecordCaretaker();

//        System.out.println("添加玩家：");
        ori.setRecord("player_1", 30);
        careTaker.saveRecord(ori.createMemento());
        ori.printCurrentRecord();

//        System.out.println("添加玩家：");
        ori.setRecord("palyer_2", 60);
        careTaker.saveRecord(ori.createMemento());
        ori.printCurrentRecord();

//        System.out.println("添加玩家：");
        ori.setRecord("player_3", 80);
        careTaker.saveRecord(ori.createMemento());
        ori.printCurrentRecord();

//        System.out.println("切换到第2个玩家：");
        ori.restoreMemento(careTaker.retriveRecord(1));
        ori.printCurrentRecord();

//        System.out.println("Exit MementoTest\n");
    }

}