package finalJavaPredict;

import java.util.HashMap;

/**
 * @author 33133
 * @see 5.在以下 Test 类中添加一个 main 方法，
 * 在其中创建一个 HashMap 集合对象用于存储学生的姓名（String 类型）和分数（Int 类型）；
 * （1）先存入以下四组数据：Jay=90；Lily=100；Tim=85；Jack=91;
 * （2）利用 for 循环遍历该集合，统计所有学生的平均分数并输出到屏幕上。
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Jay",90);
        hashMap.put("Lily",100);
        hashMap.put("Tim",85);
        hashMap.put("Jack",91);
        int sum = 0;
        for(String key : hashMap.keySet()){
            sum += hashMap.get(key);
        }
        System.out.println("平均分为"+sum/ hashMap.size());
    }
}
