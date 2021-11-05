package JiyiCarnival.flyweight;

import JiyiCarnival.entertainment.movice.flyweight.Movie;
import JiyiCarnival.entertainment.movice.flyweight.MovieControl;
import JiyiCarnival.entertainment.movice.flyweight.MovieFactory;
import org.junit.Test;

public class FlyweightTest
{

    @Test
    public void test()
    {
        System.out.println("享元模式测试：");

        MovieFactory movieFactory = MovieFactory.getInstance();
        Movie movie1 = movieFactory.getMovice("Mine");
        movie1.play("1");
        Movie movie2 = movieFactory.getMovice("Red");
        movie2.play("2");
        Movie movie3 = movieFactory.getMovice("Mine");
        movie3.play("3");
        Movie movie4 = movieFactory.getMovice("Mine");
        movie4.play("4");
        Movie movie5 = movieFactory.getMovice("White");
        movie5.play("5");
        Movie movie6 = movieFactory.getMovice("Red");
        movie6.play("6");
    }
}
