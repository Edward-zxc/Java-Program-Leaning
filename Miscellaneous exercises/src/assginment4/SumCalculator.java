package assginment4;

/**
 * @author zixuan zhou
 * @see 1、设计一个名为getSum的公有静态方法，该方法的功能计算1-50之间的偶数和
 */
public class SumCalculator {
    public static int getSum()
    {
        int sum = 0;
        for (int i = 2; i < 50; i += 2)
        {
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
       int result = getSum();
        System.out.println("1-50之间偶数和为："+result);
    }
}
