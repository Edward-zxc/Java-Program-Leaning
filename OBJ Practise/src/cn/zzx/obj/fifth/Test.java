package cn.zzx.obj.fifth;

public class Test {
    static void show(Employee employee){
        employee.calculateSalary();
    }
    public static void main(String[] args) {
        Employee manager = new Manager(50000,5000);
        Employee sales = new Sales(40000.00,4000);
        show(manager);
        show(sales);
    }
}
