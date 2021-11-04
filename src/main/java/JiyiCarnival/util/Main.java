package JiyiCarnival.util;


import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.entertainment.carousel.composite.HorseControl;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.strvideo.StrVideo;
import JiyiCarnival.util.time.Clock;

public class Main {
    public static void main(String[] args) throws Exception {
        JiyiCarnival jiyiCarnival = JiyiCarnival.getInstance();
        JiyiCarnival.setClock();
        Clock.printNowTime();

        Input.input();
        HorseControl horseControl = new HorseControl();
        horseControl.flowControl();
        //Video2Image.video2Image("src\\main\\java\\JiyiCarnival\\video\\parking.mp4","src\\main\\java\\JiyiCarnival\\imgs\\parking", "parking");

        //Image2Str.createAsciiPic("G:\\temp\\pics","G:\\temp\\a.txt");
        // Video2Image.video2Image("G:\\temp\\1.mp4","G:\\temp\\pics", "hello");
        StrVideo strVideo = new StrVideo("src\\main\\java\\JiyiCarnival\\imgs\\parking");
        strVideo.play(254, true);
        //strVideo.showStrImage("src\\main\\java\\JiyiCarnival\\imgs\\66_99.png", 255, true);

    }
}
