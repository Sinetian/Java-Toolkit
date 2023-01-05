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
        return;
    }
    public static double cal(int x , int y) {
        return x / y;
    }
    public static void main(String[] args) {
        main.sysinfo();
        int x , y , op;
        Scanner scanner = new Scanner(System.in);
        System.out.print("可用功能：\n 1.计算器 2.系统信息 3.退出");
        op = scanner.nextInt();

    }
}