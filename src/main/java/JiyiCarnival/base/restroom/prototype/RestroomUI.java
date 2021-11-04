package JiyiCarnival.base.restroom.prototype;

import JiyiCarnival.util.input.Input;
/**
 * @author WKATZZL
 * 充电宝控制类
 */
public class RestroomUI {
    /**
     * 流程控制
     */
    public void flowControl() {
        var normalOrigin = new Restroom();
        var barrierFreeOrigin = new Restroom("无障碍卫生间");
        var manOrigin = new ManRestroom();
        var womanOrigin = new WomanRestroom();

        var cloneNormalOrigin = normalOrigin.clone();
        var cloneBarrierFreeOrigin = barrierFreeOrigin.clone();
        var cloneManOrigin = manOrigin.clone();
        var cloneWomanOrigin = womanOrigin.clone();

        System.out.println("您来到了公共卫生间。");
        System.out.println("您将进入：：\n[1] 男卫生间\n[2] 女卫生间\n[3] 无障碍卫生间\n[4] 亲子卫生间\n[0]离开公共卫生间\n");
        int choice = Input.input();
        switch (choice) {
            case 1:
                cloneManOrigin.getType();
                break;
            case 2:
                cloneWomanOrigin.getType();
                break;
            case 3:
                cloneBarrierFreeOrigin.getType();
                break;
            case 4:
                cloneNormalOrigin.getType();
                break;
            case 0:
                break;
            default:
                System.out.println("输入有误，请重新输入");
                break;
        }
    }
}
