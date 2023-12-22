package cn.zzx.obj.third;

/**
 * @author 33133
 */
public class Worker extends Person{
     double salary;
     public Worker(String name,String sex,int age,double salary){
         super(name, sex, age);
        this.salary=salary;
     }
    @Override
    public void work() {
        System.out.println("工人的薪水为: "+salary);
    }
}
