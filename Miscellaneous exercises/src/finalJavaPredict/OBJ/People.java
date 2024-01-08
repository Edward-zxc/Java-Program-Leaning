package finalJavaPredict.OBJ;

/**
 * @author 33133
 * @see 6.（1）设计一个People类
 * 包含一个公有的实例属性Name、一个公有的实例属性Id，使用构造方法初始化实例属性；
 * 一个公有的方法eatFood返回一个字符串"I'm xxx,I like eating meat."
 * （此处xxx为当前对象姓名属性值）。
 * （2）设计一个People类的子类Student，添加一个私有的实例属性Age及一个修改私有属性Age的方法；
 * 使用构造方法初始化实例属性；重写父类eatFood方法并返回一个字符串
 * "I'm xxx,I'm xx,I like eating nourishing food."
 * （此处xxx和xx分别为当前对象姓名和年龄属性值）。
 * （3）分别创建上述两个类的对象，并实现多态性。
 */
public class People {
    public String name;
    public int id;
    People(String name , int id){
        this.id=id;
        this.name= name;
    }
    void eatFood(){
        System.out.println("I' am "+name+", I like eating meat.");
    }
}
