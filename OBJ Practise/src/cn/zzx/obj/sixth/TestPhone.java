package cn.zzx.obj.sixth;
import java.util.ArrayList;

/**
 * @author 33133
 */
public class TestPhone {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("小米", 1000));
        phones.add(new Phone("苹果", 8000));
        phones.add(new Phone("锤子", 2999));

        // 输出价格低于3000的手机信息
        ArrayList<Phone> affordablePhones = filterPhones(phones);
        for (Phone phone : affordablePhones) {
            System.out.println("品牌：" + phone.getBrand() + ";价格：" + phone.getPrice());
        }
    }

    // 定义方法，返回价格低于3000的手机信息
    private static ArrayList<Phone> filterPhones(ArrayList<Phone> phones)
    {
        ArrayList<Phone> affordablePhones = new ArrayList<>();
        for (Phone phone : phones)
        {
            if (phone.getPrice() < 3000)
            {
                affordablePhones.add(phone);
            }
        }
        return affordablePhones;
    }

}
