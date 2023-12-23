package cn.zzx.obj.third;

/**
 * @author 33133
 */
public class Test {
    static void show(Person person){
    person.work();
    }
    public static void main(String[] args) {
        Person student = new Student("Sarah","male",19,
                "USC","01");
        Person worker = new Worker("Cathy","male",19,50000.00);
        show(student);
        show(worker);
    }
}
