package cn.zzx.obj.fourth;

/**
 * @author 33133
 */
public class Round implements Shape{
    private int radius;
    public Round(){
        this.radius=0;
    }
    public Round(int radius){
        this.radius=radius;
    }
    @Override
    public void length() {
        double length = 2 * Math.PI * radius;
        System.out.println("圆的周长为: "+length);
    }

    @Override
    public void area() {
        double area = radius * radius * Math.PI;
        System.out.println("圆的面积为: "+area);
    }
}
