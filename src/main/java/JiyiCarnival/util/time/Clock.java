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
    private static Date startDate = new Date();
    private static Date nowTime = new Date();
    private static Date realStartTime;
    private static Date noon;
    private static Date night;

    private Clock() throws ParseException {}

    /**
     * 返回时钟单例
     * @return 单例实体
     */
    public static Clock getInstance() throws ParseException {
        SimpleDateFormat currentDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startYMD =  currentDateFormat.format(startDate);
        nowTime = currentDateFormat.parse(startYMD);
        addTime(8 * 60 * 60);
        noon = new Date(nowTime.getTime() + 12 * 60 * 1000L);
        night = new Date(nowTime.getTime() + 18 * 60 * 1000L);
        realStartTime = new Date();
        return instance;
    }

    /**
     * 获得当前时间
     * @return 当前时间
     */
   public static String getClock(){
        Date realNowTime = new Date();
        long time_diff = realNowTime.getTime() - realStartTime.getTime();
        return dateFormat.format(nowTime.getTime() + time_diff);
   }

    /**
     * 增加时间
     * @param seconds 增加的秒数
     */
    public static void addTime(int seconds){
        nowTime = new Date(nowTime.getTime() + seconds * 1000L);
    }

    /**
     * 时间类型 早下晚
     * @return 早 -1 下 0 晚 1
     */
    public static int timeType(){
        if(nowTime.before(noon))
            return -1;
        else if(nowTime.before(night))
            return 0;
        else
            return 1;
    }
}
