package finalJavaPredict;

/**
 * @author 33133
 * @see 3.（for循环）计算2000年1月1日到2008年1月1日相距多少天。
 *  （注意闰年）
 */
public class CountDays {
    public static void main(String[] args) {
        int days = 0;
        for (int i = 2000; i < 2008; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0 ) {
                days += 366;
            }else{
                days += 365;
            }
        }
        System.out.println("相距"+days+"天");
    }
}
