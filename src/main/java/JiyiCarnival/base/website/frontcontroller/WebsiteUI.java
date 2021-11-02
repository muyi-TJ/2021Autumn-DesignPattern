package JiyiCarnival.base.website.frontcontroller;

import JiyiCarnival.menu.MainMenu;
import JiyiCarnival.util.input.Input;

public class WebsiteUI {
    private FrontController frontController = new FrontController();
    public void website() throws InterruptedException {
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
                    choice = 0;
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
    }
}
