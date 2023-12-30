package finalJavaExam;

/**
 * @author 33133
 * @see 1. 完善下列程序，分别使用for循环和while循环将1~100之间所有整数的和输出到屏幕
 * 2.在Java中，如果一个方法有返回值，在调用这个方法时可以选择将其返回值赋给变量进行进一步处理，
 * 也可以直接忽略返回值。
 * 但是，如果要查看方法的返回结果，必须对其进行输出或者其他操作。
 * 在上面的代码中，如果不将 sumFor() 和 sumWhile() 方法的返回结果赋值给变量，
 * 就无法直接查看这两个方法的计算结果。
 * 因此，为了能够查看这些方法的计算结果，将它们的返回值赋给变量并进行输出是一种常见的做法。
 * 当然，如果你只是想简单地确认这些方法是否执行正确，
 * 也可以通过直接在方法内部打印出计算结果的方式来进行验证，而不必将结果赋值给变量。
 */
public class SimpleSum {
    void sumFor(){
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            sum += i;
        }
        System.out.println("用for循环求得为："+sum);
    }
    int sumWhile(){
        int sum=0;
        int j=1;
        while ( j <= 100){
            sum += j;
            j++;
        }
        return sum;
    }

    public static void main(String[] args) {
        SimpleSum simpleSum = new SimpleSum();
        simpleSum.sumFor();
        int sumWhile = simpleSum.sumWhile();
        System.out.println("用while求1+...+100为："+sumWhile);
    }
}
