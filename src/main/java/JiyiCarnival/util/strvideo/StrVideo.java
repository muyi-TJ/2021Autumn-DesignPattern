package JiyiCarnival.util.strvideo;

import javax.swing.*;
import java.awt.*;
import java.io.*;


public class StrVideo {

    private String filePath;
    private JFrame frame = new JFrame();
    /**
     * 无效果
     */
    public StrVideo(){}

    /**
     * 构造函数 设置图片文件夹路径
     * @param filePath 图片文件夹路径
     */
    public StrVideo(String filePath){
        this.filePath = filePath;
    }

    /**
     * 设置图片文件夹路径
     * @param filePath 图片文件夹路径
     */
    public void setFilePath(String filePath){
        this.filePath = filePath;
    }

    /**
     * 放映字符动画
     * @param threshold 灰度阈值
     */
    public void play(int threshold, boolean isScale) throws InterruptedException, IOException {
        File file = new File(filePath);
        File[] files = file.listFiles();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,900);
        frame.setResizable(false); //设置框架是否可由用户调整大小。
        frame.setUndecorated(false); //禁用或启用此框架的装饰
        JTextArea area = new JTextArea();
        area.setBackground(Color.BLACK);
        area.setForeground(Color.WHITE);
        area.setBounds(0,0,900,850);
        area.setFont(new Font("monospaced",Font.PLAIN,10));
        frame.add(area);
        frame.setVisible(true);
        for(int i = 0; i < files.length; i++){
            String content = Image2Str.image2str(files[i], threshold, isScale);
            area.setText(content);
            Thread.sleep(25L);
        }
    }

    public String showStrImage(String filePath, int threshold, boolean isScale) throws IOException {
        File file = new File(filePath);
        return Image2Str.image2str(file, threshold, isScale);
    }


}
