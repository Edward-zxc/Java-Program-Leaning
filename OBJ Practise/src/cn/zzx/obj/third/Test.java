package cn.zzx.obj.third;

/**
 * @author 33133
 */
public class Test {
    public static void main(String[] args) {
        Person student = new Student("Sarah", "male", 19,
                "USC", "01");
        student.work();
        Person worker = new Worker("Cathy", "male", 20, 20000.88);
        worker.work();
    }
}
