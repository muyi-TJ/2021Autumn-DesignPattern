package JiyiCarnival.base.sharedBikes;

import java.util.*;

public class StationMediator {
    protected final List<Station> StationList;

    /**
     * StationMediator 构造器
     */
    public StationMediator(){
        StationList=new ArrayList<Station>();
        System.out.println("StationMediator构造器");
    }

    /**
     * 中介系统记录新站点
     */
    public void addStation(Station station) {
        StationList.add(station);
        System.out.println("中介系统记录新站点："+station.name);
    }
    /**
     * 中介系统发布需求信息
     */
    public void tellMsg(Station station, String str){
        System.out.println("中介系统发布需求信息:");
        System.out.println(station.getName()+"需求："+str);
        for(Station oneStation : StationList){
            if(!oneStation.equals(station)){
                oneStation.readMessage(station);
            }
        }
    }
}
