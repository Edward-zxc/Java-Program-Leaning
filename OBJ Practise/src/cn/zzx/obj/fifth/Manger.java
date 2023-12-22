package cn.zzx.obj.fifth;

/**
 * @author 33133
 */
public class Manger extends Employee{
    double meritPay;
    Manger(double basicSalary,double meritPay){
        super(basicSalary);
        this.meritPay=meritPay;
    }
    @Override
    public void calculateSalary() {
        double summaryManger=basicSalary+meritPay;
        System.out.println("经理工资为："+summaryManger);
    }
}
