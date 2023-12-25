package assginment4;
import java.util.Scanner;

/**
 * @author 33133
 * @see 2、编辑程序，使用Scanner类扫描用户输入的分数，定义一个变量score，在其存放的考试分数，
 * 输出对应的等级（采用if和switch编程并运行程序，思考他们之间的联系与不同）
 * 60分以下为D等；60～69为C等；70～89为B等；90～100为A等。
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入分数：");
        int score = scanner.nextInt();
        if (score < 0 || score > 100)
        {
            System.out.println("无效的分数");
        }
        else if (score <= 60) {
            System.out.println("等级为D");
        }
        else if (score <= 69)
        {
            System.out.println("等级为C");
        }
        else if
        (score <= 89)
        {
            System.out.println("等级为B");
        }
        else
        {
            System.out.println("等级为A");
        }
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("等级为A");
                break;
            case 8:
            case 7:
                System.out.println("等级为B");
                break;
            case 6:
                System.out.println("等级为C");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("等级为D");
                break;
            default:
                System.out.println("无效的分数");
        }
        scanner.close();
    }
}
