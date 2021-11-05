package JiyiCarnival;


import JiyiCarnival.entertainment.amusementpark.singleton.JiyiCarnival;
import JiyiCarnival.util.input.Input;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Set;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException, ParseException {

        System.out.println("欢迎来到济忆嘉年华！");
        int choice = 0;
        while(0 == choice) {
            System.out.println("请选择运行方式：\n[1] 游玩模式\n[2] 单个测试\n[3] 全部测试\n[4] 退出");
            choice = Input.input();
            switch (choice){
                case 1:
                    JiyiCarnival carnival = JiyiCarnival.getInstance();
                    carnival.flowControl();
                    choice = 3;
                    break;
                case 2:
                {
                    LauncherDiscoveryRequestBuilder requestBuilder = LauncherDiscoveryRequestBuilder.request()
                            .selectors(selectPackage(Main.class.getPackageName()))
                            .filters(includeClassNamePatterns(".*Test"));
                    LauncherDiscoveryRequest allTestRequest = requestBuilder.build();
                    Launcher launcher = LauncherFactory.create();
                    TestPlan testPlan = launcher.discover(allTestRequest);
                    Set<TestIdentifier> testIdentifierSet = testPlan.getChildren("[engine:junit-jupiter]");
                    TestIdentifier[] testIdentifierArray = testIdentifierSet.toArray(TestIdentifier[]::new);
                    System.out.println(testIdentifierArray.length);
                    for (int i = 0; i < testIdentifierArray.length; i += 3) {
                        System.out.printf("%2d: %-25s %2d: %-25s %2d: %-25s\n",
                                i, testIdentifierArray[i].getDisplayName(),
                                i + 1, testIdentifierArray[i + 1].getDisplayName(),
                                i + 2, testIdentifierArray[i + 2].getDisplayName());
                    }
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("输入一个数字选择特定测试， -1退出");
                    while (true) {
                        int testChoice = scanner.nextInt();
                        if (testChoice == -1) {
                            break;
                        }
                        if (testChoice < 0 || testChoice >= testIdentifierArray.length) {
                            System.out.println("越界！");
                            continue;
                        }
                        TestIdentifier chosenTestIdentifier = testIdentifierArray[testChoice];
                        System.out.printf("正在执行测试%2d: %s\n", testChoice, chosenTestIdentifier.getDisplayName());
                        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                                .selectors(selectPackage(Main.class.getPackageName()))
                                .filters(includeClassNamePatterns(chosenTestIdentifier.getLegacyReportingName()))
                                .build();
                        launcher.execute(request);
                        Thread.sleep(500);
                        for (int i = 0; i < testIdentifierArray.length; i += 3) {
                            System.out.printf("%2d: %-25s %2d: %-25s %2d: %-25s\n",
                                    i, testIdentifierArray[i].getDisplayName(),
                                    i + 1, testIdentifierArray[i + 1].getDisplayName(),
                                    i + 2, testIdentifierArray[i + 2].getDisplayName());
                        }
                        System.out.println("输入一个数字选择特定测试， -1退出");
                    }
                    choice = 0;
                }
                    break;
                case 3:
                {
                    LauncherDiscoveryRequestBuilder requestBuilder = LauncherDiscoveryRequestBuilder.request()
                            .selectors(selectPackage(Main.class.getPackageName()))
                            .filters(includeClassNamePatterns(".*Test"));
                    LauncherDiscoveryRequest allTestRequest = requestBuilder.build();
                    Launcher launcher = LauncherFactory.create();
                    launcher.execute(allTestRequest);
                    Thread.sleep(500);
                }
                    choice = 0;
                    break;
                case 4:
                    break;
                default:
                    choice = 0;
                    break;
            }
        }
        System.out.println("今日的离开，是为了明日更好的相聚！");
        System.out.println("济忆嘉年华永远欢迎您的到来！再见！");
    }
}
