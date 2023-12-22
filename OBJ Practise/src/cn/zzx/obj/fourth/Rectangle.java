package cn.zzx.obj.fourth;

/**
 * @author 33133
 */
public class Rectangle implements Shape{
    private int width;
    private int height;
    Rectangle(int width,int height){
        this.height=height;
        this.width=height;
    }
    Rectangle(){
        this.height=0;
        this.width=0;
    }

    @Override
    public void length() {
        double length = width * 2 + height * 2;
        System.out.println("矩形周长为: "+length);
    }

    @Override
    public void area() {
        double area = width * height;
        System.out.println("矩形的面积为: "+area);
    }
}
