package finalJavaPredict.OBJ;

/**
 * @author 33133
 */
public class TestOBJ {
    public static void main(String[] args) {
        People people1 = new People("Susan",4);
        People student1 = new Student("Cathy",19,1);
        People student2 = new Student("Sarah",20,2);
        people1.eatFood();
        student1.eatFood();
        student2.eatFood();
    }
}
