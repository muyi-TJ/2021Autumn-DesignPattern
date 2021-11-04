package JiyiCarnival.util;


import JiyiCarnival.entertainment.stage.abstractfactory.StageUI;
import JiyiCarnival.util.strvideo.Image2Str;
import JiyiCarnival.util.strvideo.StrVideo;
import JiyiCarnival.util.time.Clock;

public class Main {
    public static void main(String[] args) throws Exception {

        StageUI stageUI = new StageUI();
        stageUI.flowControl();
        //Video2Image.video2Image("G:\\temp\\3.mp4","G:\\temp\\pics", "hello");

        //Image2Str.createAsciiPic("G:\\temp\\pics","G:\\temp\\a.txt");
        // Video2Image.video2Image("G:\\temp\\1.mp4","G:\\temp\\pics", "hello");
        StrVideo strVideo = new StrVideo();
        //strVideo.play(255);
        String content = strVideo.showStrImage("G:\\大学作业\\大三\\软件设计模式\\project\\2021Autumn-DesignPattern\\src\\main\\java\\JiyiCarnival\\imgs\\66_99.png", 255, false);
        System.out.println(content);

    }
}
