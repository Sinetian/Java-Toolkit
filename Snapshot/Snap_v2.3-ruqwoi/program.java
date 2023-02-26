import java.util.Scanner;
import java.util.Arrays;
public class program {
    public static void SysInfo() {
        System.out.println("************************");
        System.out.println("**    ********        **");
        System.out.println("**       **           **");
        System.out.println("**       **           **");
        System.out.println("**       **    ***    **");
        System.out.println("**       **    ***    **");
        System.out.println("************************");
        System.out.println("** Sinetian's Toolkit **");
        System.out.println("************************");
        System.out.println("*** 构建时间：2023/1/7 ***");
        System.out.println("************************");
        System.out.println("版本：Snapshot v2.3-ruqwoi");
        return;
    }
    public static double Cal(Double x , Double y , String op) {
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
            default:
                throw new java.lang.IllegalStateException("计算器：未知输入：" + op);
        }
    }
    public static void SortArray(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
         System.out.print("请输入一组浮点数，以空格分隔：");
         String input = scanner.nextLine();
         String[] strArr = input.split("\\s+");
         double[] numArr = new double[strArr.length];
         for (int i = 0; i < strArr.length; i++) {
             numArr[i] = Double.parseDouble(strArr[i]);
         }
         Arrays.sort(numArr);
         System.out.println("排序后的结果为：");
         for (double num : numArr) {
             System.out.print(num + " ");
        }
        scanner.close();
    }
    public static void main(String[] args) {
        program.sysinfo();
        Double x , y;
        int op;
        String calu;
        try (Scanner scanner = new Scanner(System.in)) {
          while(true) {
              System.out.println("可用功能：\n 1.计算器 2.系统信息 3.排序 4.再见");
              System.out.print("请输入序号：");
              op = scanner.nextInt();
              switch(op) {
                  case 1: {
                    System.out.println("计算器使用注意事项：在做减法以及除法时，请确保第一个数比后面的大。");
                    System.out.println("运算符：+（加）-（减）*（乘）/（除）%（求余）");
                    System.out.print("请输入第一个数字：");
                    x = scanner.nextDouble();
                    System.out.print("请输入第二个数字：");
                    y = scanner.nextDouble();
                    System.out.print("请输入运算：");
                    scanner.nextLine();
                    calu = scanner.nextLine();
                    System.out.println(program.Cal(x , y , calu));
                    break;
                  }
                  case 2: {
                    program.SysInfo();
                    break;
                  }
                  case 3: {
                    program.SortArray();
                      break;
                  }
                  default: {
                      throw new java.lang.IllegalArgumentException("主程序：未知输入：" + op);
                  }
              }
          }
        }
    }
}
