package cn.zzx.obj.first;

/**
 * @author 33133
 */
public class Auto {
    String brand;
    int speed;
    public Auto(String brand,int speed)
    {
        this.brand=brand;
        this.speed=speed;
    }
    public void showInfo()
    {
        System.out.println( brand + "'s speed is" + speed);
    }
}
