package JiyiCarnival.hauntedHouse;

import JiyiCarnival.entertainment.hauntedHouse.*;
import org.junit.Test;

public class hauntedHouseTest {
    @Test
    public void testBuilder(){
        HauntedHouseDirector hauntedHouseDirector=new HauntedHouseDirector();

        HauntedHouseBuilder hardHauntedHouseBuilder=new HardHauntedHouse();
        hauntedHouseDirector.setHauntedHouseBuilder(hardHauntedHouseBuilder);
        hauntedHouseDirector.construct();
        HauntedHouse hardHauntedHouse=hardHauntedHouseBuilder.build();
        hardHauntedHouse.play();

        HauntedHouseBuilder simpleHauntedHouseBuilder=new SimpleHauntedHouse();
        hauntedHouseDirector.setHauntedHouseBuilder(simpleHauntedHouseBuilder);
        hauntedHouseDirector.construct();
        HauntedHouse simpleHauntedHouse=simpleHauntedHouseBuilder.build();
        simpleHauntedHouse.play();

    }
}
