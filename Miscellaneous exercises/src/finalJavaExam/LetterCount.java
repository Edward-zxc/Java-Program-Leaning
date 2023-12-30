package finalJavaExam;
import java.util.Scanner;

/**
 * @author 33133
 * @see 4.编写个方法，该方法接收一个字符串参数，方法的功能是分别
 * 统计该字符串大，小写字母的个数，并将结果打印到屏幕上。
 * @see 0.提示：nextline()方法会读取输入中的整行文本，包括换行符。如果之前有其他输入方法
 * （如 next(), nextInt(), 等），并且没有调用 nextLine() 读取换行符，可能会导致意外的行为。
 * 在这种情况下，
 * 你可能需要在调用 nextLine() 之前添加一个额外的 nextLine() 语句，以消耗之前输入中的换行符。
 */
public class LetterCount{
    public static void countLetters(String input) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                uppercaseCount++;
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                lowercaseCount++;
            }
        }

        System.out.println("大写字母个数: " + uppercaseCount);
        System.out.println("小写字母个数: " + lowercaseCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input String:");
        String inputString = scanner.nextLine();
        countLetters(inputString);
        scanner.close();
    }
}
