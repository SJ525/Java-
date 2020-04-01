package dateClass;

import java.util.Date;

/*创建Date类的对象*/
public class Test13_10 {
    public static void main(String[] args) {
        /*Date类的构造方法*/
        Date date=new Date();//当前的系统时间
        System.out.println("当前系统时间："+date.toString());//输出
        /*使用Date类的带参构造方法创建Date类对象*/
        Date date1=new Date(1000);
        System.out.println("计算机起始时间："+date1.toString());
    }
}
