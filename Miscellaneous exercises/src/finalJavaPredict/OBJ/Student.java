package finalJavaPredict.OBJ;

/**
 * @author 33133
 */
public class Student extends People{
    private final int age;
    Student (String name ,int age , int id){
        super(name, id);
        this.age=age;
    }
    @Override
    void eatFood(){
        System.out.println("I' am "+ this.name + ". I' am "+ this.age+" years old .I like eating nourishing food");
    }
}
