package cn.zzx.obj.fifth;

/**
 * @author 33133
 */
public class Sales extends Employee{
    double commission;
    Sales(double basicSalary,double commission){
        super(basicSalary);
        this.commission=commission;
    }

    @Override
    void calculateSalary() {
        double sumSales = basicSalary +commission;
        System.out.println("销售人员的工资高为:"+sumSales);
    }
}
