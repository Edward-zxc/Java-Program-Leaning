package cn.zzx.obj.fifth;

/**
 * @author 33133
 */
public class Sales extends Employee{
   double commissionSalary;
   Sales(double basicSalary,double commissionSalary){
       super(basicSalary);
       this.commissionSalary=commissionSalary;
   }
    @Override
    public void calculateSalary() {
       double summarySales = basicSalary+commissionSalary;
        System.out.println("销售人员工资为： "+summarySales);
    }
}
