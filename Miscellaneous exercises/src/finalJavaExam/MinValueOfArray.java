package finalJavaExam;

/**
 * @author 33133
 * @see 2. 在Test类中编写一个名为getMinNum的公有静态方法，
 * 方法的参数为一个一维int数组，方法的功能是找出数组中的最小值并返回出来。
 */
public class MinValueOfArray {
    static int getMinNum(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {9,2,8,6,4};
        int minNum = getMinNum(arr);
        System.out.println("数组中最小的元素为："+minNum);
    }
}
