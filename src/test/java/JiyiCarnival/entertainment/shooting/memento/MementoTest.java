package JiyiCarnival.entertainment.shooting.memento;

import JiyiCarnival.entertainment.shooting.MementoIF;
import JiyiCarnival.entertainment.shooting.RecordCaretaker;
import JiyiCarnival.entertainment.shooting.RecordOriginator;
import org.junit.Test;

import static org.junit.Assert.*;

public class MementoTest {

    @Test
    void testMemento(){
        RecordOriginator ori=new RecordOriginator();
        RecordCaretaker careTaker=new RecordCaretaker();

        ori.setRecord("player_1",30);
        careTaker.saveRecord(ori.createMemento());

        ori.setRecord("palyer_2",60);
        careTaker.saveRecord(ori.createMemento());

        ori.setRecord("player_3",80);
        careTaker.saveRecord(ori.createMemento());


    }

}