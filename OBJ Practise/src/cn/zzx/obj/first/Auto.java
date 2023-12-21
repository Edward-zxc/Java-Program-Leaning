package cn.zzx.obj.first;

/**
 * @author 33133
 */
public class Auto {
    String Brand;
    int Speed;
    public Auto(String Band,int Speed)
    {
        this.Brand=Band;
        this.Speed=Speed;
    }
    public void showInfo()
    {
        System.out.println( Brand + "'s speed is" + Speed);
    }
}
