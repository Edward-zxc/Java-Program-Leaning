package finalJavaExam;
import java.util.Scanner;

/**
 * @author 33133
 * @see 7. 利用循环控制和键盘输入，获取用户输入的6个整数，输出该6个数的和。
 */
public class SumSIx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("请输入第"+i+"个整数：");
            int inputNumber = scanner.nextInt();
            sum += inputNumber;
        }
        System.out.println("六个数和为："+sum);
    }
}
