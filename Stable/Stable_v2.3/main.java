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
        System.out.println("*** 版本：Stable v2.3 ***");
        System.out.println("*** 构建时间：2023/1/6 ***");
        System.out.println("************************");
        System.out.println("这是Java-Toolkit的初代版本，仅仅开发了计算器。 \n 如果你愿意看看我的代码，你一定会承认Java的开发难度比C++高。");
        return;
    }
    public static double cal(int x , int y , int op) {
        switch(op) {

        }
    }
    public static void main(String[] args) {
        main.sysinfo();
        int x , y , op;
        char calu;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("可用功能：\n 1.计算器 2.系统信息 3.退出");
            System.out.print("请输入序号：");
            op = scanner.nextInt();
            switch(op) {
                case 1: {
                  System.out.println("计算器使用注意事项：在做减法以及除法时，请确保第一个数比后面的大。");
                  System.out.println("运算符：+（加）-（减）*（乘）/（除）%（求余）");
                  System.out.print("请输入第一个数字：");
                  x = scanner.nextInt();
                  System.out.print("请输入第二个数字：");
                  y = scanner.nextInt();
                  System.out.print("请输入运算：");
                  calu = scanner.nextLine();
                  System.out.println(main.cal(x , y , op));
                }
                case 2: {
                  main.sysinfo();
                }
                case 3: {
                  return;
                }
            }
        }
    }
}
