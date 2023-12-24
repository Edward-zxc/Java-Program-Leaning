package assginment3;

/**
 * @author 33133
 * @see 3.编写一个公有方法，该方法的参数为一个整型数组，该方法定义一个数组，
 * 数组元素为{2，4，3，7，5，6，0，}
 * 找出数组中最小数连同下标一起输出.
 */
public class findMinNumberAndIndex {

    public static void main(String[] args) {
        int[] arr = {2,4,3,7,5,6,0};
        findMinNumberWithIndex(arr);
    }
    public static void findMinNumberWithIndex(int[] arr){
        if (arr == null || arr.length == 0){
            System.out.println("数组为空");
        }
            int minIndex = 0;
            int minNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNumber){
                minNumber = arr[i];
                minIndex = i;
            }
        }
        System.out.println("数组中最小数为：" + minNumber);
        System.out.println("数组中最小数索引为：" + minIndex);
    }
}
