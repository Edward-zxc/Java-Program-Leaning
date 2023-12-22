### 第四题
（1）定义一个形状接口Shape<br>
    Shape的要求：定义两个抽象方法<br>
    1.定义计算周长的抽象方法public abstract void length();<br>
    2.定义一个计算面积的抽象方法public abstract void area();<br>
（2）定义一个圆类Round（Round这个类实现接口Shape）<br> 
    Round的要求：<br>
    1.定义一个成员变量   private  int  radius<br>
    2.构造方法（有参和无参的都要写）<br>
    3.实现接口中的两个抽象方法，周长的方法	public void length(); 面积的方法public void area();<br>
（3）定义一个使用该接口的矩形类Rectangle（Rectangle这个类实现接口Shape）；<br>
    Rectangle的要求：<br>
    1.定义两个成员变量<br>
    private  int width；<br>
    private  int height；<br>
    2.构造方法（有参和无参的都要写）<br>
    3.实现接口中的两个抽象方法<br>
    输出周长的方法 public void length();<br>
    输出面积的方法 public void area();<br>
    创建一个测试类Test<br>
    Test要求：<br>
    1．创建一个圆，并且输出该圆的周长、面积<br>
    2．创建一个矩形，并且输出该矩形的周长和面积。<br>
