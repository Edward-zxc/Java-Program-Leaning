package cn.zzx.obj.fourth;


/**
 * @author 33133
 */
public class Round implements Shape{
    private int radius;
    Round(int radius){
        this.radius=radius;
    }
    Round(){
    }

    @Override
    public void length() {
        System.out.println("圆的周长为："+radius*2*Math.PI);
    }

    @Override
    public void area() {
        System.out.println("圆的面积为："+radius*radius*Math.PI);
    }
}
