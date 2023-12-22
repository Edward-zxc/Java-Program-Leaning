package cn.zzx.obj.third;

/**
 * @author 33133
 */
public class Student extends Person{
    private String school;
    private String studentNumber;
    public Student(String name,String sex,int age,String school,String studentNumber){
        super(name, sex, age);
        this.school=school;
    this.studentNumber=studentNumber;
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习!");
    }
}
