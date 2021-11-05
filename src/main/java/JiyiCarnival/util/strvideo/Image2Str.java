package JiyiCarnival.util.strvideo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

/**
 * @author WKATZZL
 * 图片转字符串
 */

public class Image2Str {

    /**
     * 重新设置图片大小
     * @param origin 原始图片
     * @param targetW 目标宽度
     * @param targetH 目标高度
     * @return 返回设置后的图片
     */
    public static BufferedImage resize(BufferedImage origin, int targetW, int targetH) {
        int type = origin.getType();
        BufferedImage target;
        double scaleX = (double) targetW / origin.getWidth();
        double scaleY = (double) targetH / origin.getHeight();
        if (type == BufferedImage.TYPE_CUSTOM) { // handmade
            ColorModel cm = origin.getColorModel();
            WritableRaster raster = cm.createCompatibleWritableRaster(targetW, targetH);
            boolean alphaPremultiplied = cm.isAlphaPremultiplied();
            target = new BufferedImage(cm, raster, alphaPremultiplied, null);
        } else {
            target = new BufferedImage(targetW, targetH, type);
        }
        Graphics2D g = target.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.drawRenderedImage(origin, AffineTransform.getScaleInstance(scaleX, scaleY));
        g.dispose();
        return target;
    }

    /**
     * 图片转字符
     * @param file 转换为字符的图片文件
     * @param threshold 灰度阈值 超过即设置为space
     * @return 图片字符串
     */
    public static String image2str(File file, int threshold, int xstart, int ystart, boolean isScale) throws IOException {
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMnOPQRSTUVWXYZ^&*(){}[]\\:;''<>?/~`";
        String picStr = "";
        BufferedImage imageOrigin = ImageIO.read(file);
        BufferedImage image;
        if(isScale)
            image = resize(imageOrigin, 220, 80);
        else
            image = imageOrigin;
        for (int y = ystart; y < image.getHeight(); y += 1) {
            StringBuilder linePixel = new StringBuilder ();
            for (int x = xstart; x < image.getWidth(); x += 1) {
                int pixel = image.getRGB(x, y);
                int r = (pixel & 0xff0000) >> 16, g = (pixel & 0xff00) >> 8, b = pixel & 0xff;
                int alpha = (pixel & 0xff000000) >> 24;
                // 转化为灰度图片
                float gray = 0.299f * r + 0.578f * g + 0.114f * b;
                int index = Math.round(gray * base.length() / 256);
                if(gray >= threshold)
                    linePixel.append(" ");
                else if(gray < 5)
                    linePixel.append(" ");
                else if(alpha != 0)
                    linePixel.append(index >= base.length() ? " " : base.charAt(index));
                else
                    linePixel.append(" ");
            }
            picStr += linePixel+"\r\n";
        }
        return picStr;
    }

}