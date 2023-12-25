package cn.zzx.obj.fifth;

/**
 * @author zhou
 */
public class Sales extends Employee{
    private final double commission;
    Sales(double basicSalary,double commission){
        super(basicSalary);
        this.commission=commission;
    }

    @Override
    void calculateSalary() {
        double sumSales = basicSalary +commission;
        System.out.println("销售人员的工资为:"+sumSales);
    }
}
