package JiyiCarnival.util.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author WKATZZL
 * 时钟类 单例
 */
public class Clock {

    private static Clock instance;

    static {
        try {
            instance = new Clock();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static Date startDate;
    private static Date nowTime = new Date();
    private static Date realStartTime;
    private static Date baseTime;

    private Clock() throws ParseException {}

    /**
     * 返回时钟单例
     * @return 单例实体
     */
    public static Clock getInstance() throws ParseException {
        startDate = new Date();
        SimpleDateFormat currentDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startYMD =  currentDateFormat.format(startDate);
        nowTime = currentDateFormat.parse(startYMD);
        baseTime = new Date(nowTime.getTime());
        addTime(8 * 60 * 60);
        realStartTime = new Date();
        return instance;
    }

    /**
     * 获得当前时间
     * @return 当前时间
     */
   public static void printNowTime(){
        Date realNowTime = new Date();
        long time_diff = realNowTime.getTime() - realStartTime.getTime();
        String time = dateFormat.format(nowTime.getTime() + time_diff);
        System.out.println("当前时间是：" + time);
   }

    /**
     * 增加时间
     * @param seconds 增加的秒数
     */
    public static void addTime(int seconds){
        nowTime = new Date(nowTime.getTime() + seconds * 1000L);
    }


    /**
     * 检验时间是否允许
     * @param startHour
     * @param endHour
     * @return 允许则返回true 否则为false
     */
    public static boolean timeCheck(int startHour, int endHour){
        Date startTime = new Date(baseTime.getTime() + startHour * 60 * 60);
        Date EndTime = new Date(baseTime.getTime() + endHour * 60 * 60);
        if(nowTime.after(startTime) && nowTime.before(baseTime)){
            return true;
        }
        else
            return false;
    }


}
