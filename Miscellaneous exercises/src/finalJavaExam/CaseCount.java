package finalJavaExam;

/**
 * @author 33133
 * @see 3. 在Test类中编写一个名为countChars的公有静态方法，该方法接收一个字符串参数，
 * 方法的功能是分别统计该字符串中大、小写字母的个数，并将结果打印到屏幕上。
 * toCharArray() 是 Java 中 String 类的一个方法，它用于将字符串转换为字符数组。
 *  使用 toCharArray() 方法将字符串转换为字符数组
 *  String str = "Hello, World!";
 *  char[] charArray = str.toCharArray();
 */
public class CaseCount {
    static void countChars(String str) {

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char ch : str.toCharArray()) {
            // 判断字符是否为大写字母
            if (ch >= 'A' && ch <= 'Z') {
                upperCaseCount++;
            }
            // 判断字符是否为小写字母
            else if (ch >= 'a' && ch <= 'z') {
                lowerCaseCount++;
            }
        }
        System.out.println("大写字母个数为："+upperCaseCount);
        System.out.println("小写字母个数为："+lowerCaseCount);
    }

    public static void main(String[] args) {
        String str = "Hello World !";
        countChars(str);
    }
}
