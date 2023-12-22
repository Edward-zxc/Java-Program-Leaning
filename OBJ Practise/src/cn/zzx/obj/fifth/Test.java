package cn.zzx.obj.fifth;

/**
 * @author 33133
 */
public class Test {
        static void show(Employee employee){
            employee.calculateSalary();
        }

    public static void main(String[] args) {
        Manger manger = new Manger(50000.33, 5000.24);
        Sales sales = new Sales(30000.25, 4000.26);
        show(manger);
        show(sales);
    }
}
