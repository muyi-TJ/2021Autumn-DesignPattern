package JiyiCarnival.menu;

import JiyiCarnival.base.website.frontcontroller.WebsiteUI;

/**
 * @author WAKTZZL
 * 主菜单类
 */
public class MainMenu {
    private static WebsiteUI websiteUI = new WebsiteUI();

    /**
     * 打印主菜单
     * 包括购票页面和多种游玩路线
     * @throws InterruptedException 使用了线程延迟函数
     */
    public static void printMenu() throws InterruptedException {
        websiteUI.website();
    }
}
