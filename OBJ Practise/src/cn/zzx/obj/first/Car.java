package cn.zzx.obj.first;

/**
 * @author 33133
 */
public class Car extends Auto{
    int wheels;
    public Car(String brand, int speed,int wheels) {
        super(brand,speed);
        this.wheels=wheels;
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    public static void main(String[] args) {
        Car car = new Car("Porsche",250,4);
        Car vehicle = new Car("奔驰",300,4);
        System.out.println(" 汽车品牌是："+car.brand+"车速为："+car.speed+"车轮数为："+car.wheels);
        System.out.println(" 汽车品牌是："+vehicle.brand+"车速为："+vehicle.speed+"车轮数为："+vehicle.wheels);
    }
}
