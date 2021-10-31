package JiyiCarnival.base.bikes.mediator;

import JiyiCarnival.Output;

import java.util.*;

/**
 * 站点中介系统类
 */
public class StationMediator {
    protected final List<Station> StationList;

    /**
     * StationMediator 构造器
     */
    public StationMediator(){
        StationList=new ArrayList<Station>();
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "StationMediator构造器"
        );
    }

    /**
     * 中介系统记录新站点
     */
    public void addStation(Station station) {
        StationList.add(station);
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "中介系统记录新站点："+station.name
        );
    }
    /**
     * 中介系统发布需求信息
     */
    public void tellMsg(Station station, String str){
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                "中介系统发布需求信息:"
        );
        Output.output(
                this.getClass().toString(),
                "initialize",
                String.valueOf(System.identityHashCode(this)),
                station.getName()+"需求："+str
        );
        for(Station oneStation : StationList){
            if(!oneStation.equals(station)){
                oneStation.readMessage(station);
            }
        }
    }
}
