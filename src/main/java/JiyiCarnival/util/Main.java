package JiyiCarnival.util;


public class Main {
    public static void main(String[] args) throws Exception {

        //Video2Image.video2Image("G:\\temp\\3.mp4","G:\\temp\\pics", "hello");

        // Image2Str.createAsciiPic("G:\\temp\\pics","G:\\temp\\a.txt");
        // Video2Image.video2Image("G:\\temp\\1.mp4","G:\\temp\\pics", "hello");
        StrVideo strVideo = new StrVideo("G:\\temp\\pics");
        strVideo.play(255);

    }
}