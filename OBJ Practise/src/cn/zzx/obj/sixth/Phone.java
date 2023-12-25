package cn.zzx.obj.sixth;

/**
 * @author 33133
 */
public class Phone {
    private final String brand;
    private final double price;
    Phone(String brand,double price){
        this.brand=brand;
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}
