package quickSort;

/**
 * @author 33133
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2, 7, 1, 6};
        quickSort(array, 0, array.length - 1);
        System.out.println("排序后的数组：");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    // 主要的快速排序方法
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // 分割数组，获取基准值的索引
            int partitionIndex = partition(array, low, high);

            // 对基准值左右两侧的子数组进行递归排序
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // 分割数组方法
    public static int partition(int[] array, int low, int high) {
        // 选择最后一个元素作为基准值
        int pivot = array[high];
        int i = low - 1;

        // 遍历数组，将小于基准值的元素移到左侧
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        // 将基准值放到正确的位置
        swap(array, i + 1, high);

        // 返回基准值的索引
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
