package assginment4;
import java.util.HashMap;
import java.util.Collection;

/**
 * @author 33133
 * @implNote 3、创建HashMap对象sites，添加键值对
 * key: 1 value: Google
 * key: 2 value: Runoob
 * key: 3 value: Taobao
 * key: 4 value: Zhihu
 * (1)	输出key和value
 * (2)	返回所有value值
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> sites = new HashMap<>();
        sites.put(1, "Google");
        sites.put(2, "Runoob");
        sites.put(3, "Taobao");
        sites.put(4, "Zhihu");

        // 输出key和value
        for (Integer key : sites.keySet()) {
            System.out.println("key: " + key + " value: " + sites.get(key));
        }


        Collection<String> values = sites.values();
        System.out.println("所有value值: " + values);
    }
}
