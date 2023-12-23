package assginment3;
import java.util.Scanner;

/**
 * @author 33133
 * @see 2.设计一个方法使用递归计算该数的阶乘n>1时的阶乘等于1*2*3*...*(n-1)*n;
 * 0的阶乘等于1,返回阶乘的结果。
 */
public class Factorial {
    public static int factorial (int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else if (n > 1)
        {
           return n * factorial(n-1);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数: ");
        int number = scanner.nextInt();
        int result=factorial(number);
        System.out.println("阶乘结果为: "+result);
        scanner.close();
    }
}
