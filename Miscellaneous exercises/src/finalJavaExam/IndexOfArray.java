package finalJavaExam;

/**
 * @author 33133
 * @see 4. 在Test类中编写一个名为getIndex的公有静态，
 * 该方法有两个参数，分别为一个整型数组及一个整数，
 * 该方法返回值为该整数在数组中第一次出现位置的下标，若该整数不在数组中则返回值为-1
 */
public class IndexOfArray {
    public static int  getIndex(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8,9,5,4,3};
        int target = 10;
        int result = getIndex(arr,target);
        System.out.println("整数"+target+"在数组中第一次出现位置的下标："+result);
    }
}
