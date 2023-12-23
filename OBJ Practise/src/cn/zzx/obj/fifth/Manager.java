package cn.zzx.obj.fifth;

/**
 * @author 33133
 */
public class Manager extends Employee{
    double performancePay;
    Manager(double basicSalary,double performancePay) {
        super(basicSalary);
        this.performancePay=performancePay;
    }

    @Override
    void calculateSalary() {
        double sumManager = basicSalary + performancePay;
        System.out.println("经理的工资为:"+ sumManager);
    }
}
