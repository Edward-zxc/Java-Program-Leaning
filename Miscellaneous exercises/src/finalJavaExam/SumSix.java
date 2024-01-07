package finalJavaExam;
import java.util.Scanner;

/**
 * @author 33133
 * @see 7. 利用循环控制和键盘输入，获取用户输入的6个整数，输出该6个数的和。
 */
public class SumSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input six numbers");
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            int inputNumber = scanner.nextInt();
            sum += inputNumber;
        }
        System.out.println("The sum of the six numbers is："+sum);
        scanner.close();
    }
}
