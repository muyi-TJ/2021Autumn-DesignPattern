package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.base.ticketing.converter.Ticket;
import JiyiCarnival.util.input.Input;
import JiyiCarnival.util.visitor.Visitor;

/**
 * @author WAKTZZL
 * 网站UI类
 */

public class WebsiteUI {

    private FrontController frontController = new FrontController();
    /**
     * 显示网站
     * @throws InterruptedException 使用了线程延迟函数
     */
    public int website() throws InterruptedException {
        frontController.dispatchUserRequest("HOME");
        int choice = 0;
        while(0 == choice) {
            System.out.println("请选择您想进入的页面：\n[1] 官网主页 \n[2] 购票页面\n[3] 招聘信息\n" +
                    "[4] 帮助信息\n[5] 离开网站，重新选择运行方式" );
            choice = Input.input();
            switch (choice){
                case 1:
                    frontController.dispatchUserRequest("HOME");
                    choice = 0;
                    break;
                case 2:
                    frontController.dispatchUserRequest("TICKET");
                    break;
                case 3:
                    frontController.dispatchUserRequest("RECRUIT");
                    choice = 0;
                    break;
                case 4:
                    frontController.dispatchUserRequest("HELP");
                    choice = 0;
                    break;
                case 5:
                    System.out.println("再见！");
                    break;
                default:
                    choice = 0;
                    break;
            }
        }
        return choice;
    }



}
