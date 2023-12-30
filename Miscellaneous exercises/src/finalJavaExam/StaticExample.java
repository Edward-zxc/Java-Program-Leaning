package finalJavaExam;

/**
 * @author 33133
 */
public class StaticExample {
    // 静态属性（类变量）
    public static int staticVariable = 0;

    // 实例属性（实例变量）
    public int instanceVariable;

    // 静态方法
    public static void staticMethod() {
        System.out.println("这是一个静态方法");
        // 在静态方法中，无法直接访问实例变量
        // System.out.println("无法访问实例变量：" + instanceVariable);
    }

    // 实例方法
    public void instanceMethod() {
        System.out.println("这是一个实例方法");
        // 在实例方法中，可以访问静态变量
        System.out.println("静态变量：" + staticVariable);
        // 也可以访问实例变量
        System.out.println("实例变量：" + instanceVariable);
    }

    public static void main(String[] args) {
        // 创建两个对象（实例）
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        // 通过类名直接访问静态变量
        System.out.println("通过类名直接访问静态变量：" + StaticExample.staticVariable);

        // 通过对象访问实例变量
        obj1.instanceVariable = 10;
        obj2.instanceVariable = 20;

        // 调用静态方法
        StaticExample.staticMethod();

        // 调用实例方法
        obj1.instanceMethod();
        obj2.instanceMethod();
    }
}
