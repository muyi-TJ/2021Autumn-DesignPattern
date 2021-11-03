package JiyiCarnival.entertainment.firework.bridge;

/**
 * @author WKATZZL
 * 烟花释放流程控制
 */
public class FireworkControl {
    public void flowControl(){
        FlowerFirework blueFlowerFirework = new FlowerFirework(new Blue());
        HeartFirework redHeartFirework = new HeartFirework(new Red());
        FlowerFirework redFlowerFirework = new FlowerFirework(new Blue());
        HeartFirework blueHeartFirework = new HeartFirework(new Red());
        blueFlowerFirework.letOffPrint();
        redHeartFirework.letOffPrint();
        redFlowerFirework.letOffPrint();
        blueHeartFirework.letOffPrint();
        //TODO 可加入字符动画
    }
}
