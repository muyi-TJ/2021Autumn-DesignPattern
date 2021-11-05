package JiyiCarnival.util.strvideo;

import javax.swing.*;
import java.awt.*;
import java.io.*;


public class StrVideo {

    private String filePath;
    private JFrame frame = new JFrame();
    private JTextArea area = new JTextArea();

    public void init(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,800,800);
        frame.setResizable(false); //设置框架是否可由用户调整大小。
        frame.setUndecorated(false); //禁用或启用此框架的装饰
        area.setBackground(Color.BLACK);
        area.setForeground(Color.WHITE);
        area.setBounds(0,0,900,900);
        area.setFont(new Font("monospaced",Font.PLAIN,10));
        frame.add(area);
    }
    /**
     * 无效果
     */
    public StrVideo(){init();}

    /**
     * 构造函数 设置图片文件夹路径
     * @param filePath 图片文件夹路径
     */
    public StrVideo(String filePath){
        init();
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
    public void play(int threshold, int xstart, int ystart, boolean isScale) throws InterruptedException, IOException {
        File file = new File(filePath);
        File[] files = file.listFiles();
        frame.setVisible(true);
        imageShow();
        for(int i = 0; i < files.length; i++){
            String content = Image2Str.image2str(files[i], threshold, xstart, ystart, isScale);
            area.setText(content);
            Thread.sleep(40L);
        }
    }

    public void showStrImage(String filePath, int threshold, int xstart, int ystart, boolean isScale) throws IOException, InterruptedException {
        File file = new File(filePath);
        String content = Image2Str.image2str(file, threshold, xstart, ystart, isScale);
        area.setText(content);
    }

    public void imageShow(){
        frame.setVisible(true);
    }

    public void close(){
        frame.setVisible(false);
    }

}
