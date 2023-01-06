import java.util.Formatter;
import java.util.Scanner;
public class main {
    public static void sysinfo() {
        System.out.println("************************");
        System.out.println("**    ********        **");
        System.out.println("**       **           **");
        System.out.println("**       **           **");
        System.out.println("**       **    ***    **");
        System.out.println("**       **    ***    **");
        System.out.println("************************");
        System.out.println("** Sinetian's Toolkit **");
        System.out.println("************************");
        System.out.println("版本：Stable v2.3");
        System.out.println("这是Java-Toolkit的初代版本，仅仅开发了计算器。 \n 如果你愿意看看我的代码，你一定会承认Java的开发难度比C++高。");
        return;
    }
    public static double cal(int x , int y) {
        return x / y;
    }
    public static void main(String[] args) {
        main.sysinfo();
        int x , y , op;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("可用功能：\n 1.计算器 \n 2.系统信息 \n 3.退出");
            System.out.print("请输入序号：");
            op = scanner.nextInt();
            switch(op) {
                case 1: {
                  System.out.print("请输入第一个数字：");
                  x = scanner.nextInt();
                  System.out.print("请输入第二个数字：");
                  y = scanner.nextInt();
                }
            }
        }
    }
}
