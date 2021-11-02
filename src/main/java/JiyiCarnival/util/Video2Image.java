package JiyiCarnival.util;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author WKATZZL
 * 视频转图片
 */

public class Video2Image {

    /**
     * 视频抽帧
     * @param videoPath 视频所在路径
     * @param picPath 输出图片文件夹
     * @param picName 图片存储名字
     */
    public static void video2Image(String videoPath, String picPath, String picName) throws Exception {
        FFmpegFrameGrabber frames = FFmpegFrameGrabber.createDefault(videoPath);
        frames.start();
        int videoLength = frames.getLengthInFrames();
        Frame frame;
        // 抽帧间隔
        int gap = 3;
        for (int k = 0, j = 0; k < videoLength; k++){
            String index = String.format("%03d", j);
            frame = frames.grabImage();
            if (k % gap==0){
                j++;
                frame2Image(frame, picPath, picName, index);
            }
        }
        frames.stop();
    }

    /**
     * 视频帧转化为图片
     * @param frame 视频帧
     * @param picPath 图片保存路径
     * @param picName 图片名
     * @param index 字符索引
     */

    public static void frame2Image(Frame frame, String picPath, String picName, String index) {
        if (null == frame || null == frame.image) {
            return;
        }
        Java2DFrameConverter converter = new Java2DFrameConverter();
        String imgType = "jpg";
        String fileName = picPath + File.separator + picName + "_" + index + "." + imgType;
        BufferedImage img = converter.getBufferedImage(frame);
        File output = new File(fileName);
        try {
            ImageIO.write(img, imgType, output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
