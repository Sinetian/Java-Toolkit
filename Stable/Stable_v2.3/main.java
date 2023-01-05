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
    }
    public static double cal(int x , int y) {
        return x / y;
    }
    public static void main(String[] args) {
        main.sysinfo();
        int x , y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1:");
        x = scanner.nextInt();
        System.out.print("Input number 2:");
        y = scanner.nextInt();
        System.out.println(main.cal(x , y));

    }
}