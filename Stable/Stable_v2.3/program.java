import java.util.Scanner;
public class program {
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
    public static double cal(Double x , Double y , String op) {
        switch(op) {
          case "+": {
            return x + y;
          }
          case "-": {
            return x - y;
          }
          case "*": {
            return x * y;
          }
          case "/": {
            return x / y;
          }
          case "%": {
            return x % y;
          }
        }
        return 0;
    }
    public static void main(String[] args) {
        program.sysinfo();
        Double x , y;
        int op;
        String calu;
        try (Scanner scanner = new Scanner(System.in)) {
          while(true) {
              System.out.println("可用功能：\n 1.计算器 2.系统信息 3.退出");
              System.out.print("请输入序号：");
              op = scanner.nextInt();
              switch(op) {
                  case 1: {
                    System.out.println("计算器使用注意事项：在做减法以及除法时，请确保第一个数比后面的大。");
                    System.out.println("运算符：+（加）-（减）*（乘）/（除）%（求余）");
                    System.out.print("请输入第一个数字：");
                    x = (double) scanner.nextInt();
                    System.out.print("请输入第二个数字：");
                    y = (double) scanner.nextInt();
                    System.out.print("请输入运算：");
                    calu = scanner.nextLine();
                    System.out.println(program.cal(x , y , calu));
                  }
                  case 2: {
                    program.sysinfo();
                  }
                  case 3: {
                    return;
                  }
              }
          }
        }
    }
}