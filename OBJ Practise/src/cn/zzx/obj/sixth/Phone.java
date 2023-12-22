package cn.zzx.obj.sixth;

/**
 * @author 33133
 */
public class Phone {
    private String brand;
    private double price;
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
