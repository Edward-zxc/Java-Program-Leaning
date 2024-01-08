package finalJavaPredict;
import java.util.Scanner;

/**
 * @author 33133
 * @see 1.读入一个整数，表示一个人的年龄。
 * 读入一个整数，表示一个人的年龄；
 * 如果小于6岁，则输出“儿童”，6岁到13岁，输出“少 儿”；14岁到17岁，
 * 输出“青少年”；18岁到35岁，输出“青年”；36岁到50岁，输出“中年”； 50岁以上输出“中老年”
 */
public class AgeIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 6){
            System.out.println("儿童");
        } else if (age >= 6 && age <= 13) {
            System.out.println("少儿");
        } else if (age >= 14 && age <= 17) {
            System.out.println("青少年");
        } else if (age >=18 && age <= 35) {
            System.out.println("青年");
        } else if (age >= 36 && age <= 50) {
            System.out.println("中年");
        }else {
            System.out.println("中老年");
        }
        scanner.close();
    }
}
