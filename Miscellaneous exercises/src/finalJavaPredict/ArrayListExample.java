package finalJavaPredict;

import java.util.ArrayList;

/**
 * @author 33133
 * @see 4.在以下 Test 类中添加一个 main 方法，
 * 在其中创建一个 ArrayList集合对象用于存储学生的姓名（String 类型）；
 * （1）先存入以下四组数据：Jay、Lily、Tim、Jack;
 * （2）利用 for 循环遍历该集合。
 * （3）删除List索引为2的元素，修改List索引为1的元素，改名Lucy。
 * （4）利用 for 循环遍历该集合。
 */
public class ArrayListExample {
    public static void main(String[] args) {
        //(1)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Jay");
        arrayList.add("Lily");
        arrayList.add("Tim");
        arrayList.add("Jack");
        for(String element : arrayList){
            System.out.println(element+"\t");
        }
        //（2）
        arrayList.remove(2);
        arrayList.set(1,"Lucy");
        //(3)
        for (String element : arrayList){
            System.out.println(element+"\t");
        }
    }
}
