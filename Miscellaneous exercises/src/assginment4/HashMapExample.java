package assginment4;
import java.util.HashMap;
import java.util.Collection;

/**
 * @author 33133
 * @implNote 3、创建HashMap对象sites，添加键值对
 * key: 1 value: Google
 * key: 2 value: Apple
 * key: 3 value: Amazon
 * key: 4 value: Alibaba
 * (1)	输出key和value
 * (2)	返回所有value值
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> sites = new HashMap<>();
        //添加键对值
        sites.put(1, "Google");
        sites.put(2, "Amazon");
        sites.put(3, "Taobao");
        sites.put(4, "Alibaba");


        /*
         *for (int i = 1; i <= sites.size(); i++) {
         *System.out.println("key: " + i + " value: " + sites.get(i));
         *}
         * 使用 size() 方法获取了 HashMap 中键值对的数量，然后通过一个从 1 到 size 的循环，
         * 依次取出每个键，并通过 get() 方法获取对应的值，并将键和值打印输出。
         * 需要注意的是，在 HashMap 中，键的下标从 1 开始，而不是从 0 开始。
         */
        for (Integer key : sites.keySet()) {
            System.out.println("key: " + key + " value: " + sites.get(key));
        }

        //输出所有value
        Collection<String> values = sites.values();
        System.out.println("所有value值: " + values);
    }
}
