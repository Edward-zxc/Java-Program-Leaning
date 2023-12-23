package cn.zzx.obj.fourth;

/**
 * @author 33133
 */
public class Rectangle implements Shape{
    private final int width;
    private final int height;
    Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }

    @Override
    public void length() {
        System.out.println("矩形周长："+(width+height)*2);
    }

    @Override
    public void area() {
        System.out.println("矩形面积："+width*height);
    }
}
