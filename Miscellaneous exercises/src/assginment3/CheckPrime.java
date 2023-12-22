package assginment3;
import java.util.Scanner;

/**
 * @author 33133
 * @see 1.编写一个名为 isPrime的公有方法，方法的参数为一个整数，判断该整数是否为质数，
 * 若是则输出x是质数，否则输出不是质数。
 */
public class CheckPrime {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个整数：");
            int numberToCheck = scanner.nextInt();
            isPrime(numberToCheck);
            scanner.close();
        }

        // 判断一个整数是否为质数的方法（试除法）
        public static void isPrime(int number)
        {
            if (number <= 1)
            {
                System.out.println(number + "不是质数");
                return;
            }
            for (int i = 2; i < number; i++)//i<Math.sqrt(number)
            {
                if (number % i == 0)
                {
                    System.out.println(number + "不是质数");
                    return;
                }
            }
            System.out.println(number + "是质数");
        }
    }


