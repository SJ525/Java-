package 实现多线程的方式;

/*线程类的使用*/
public class TestMyThread {
    //主方法负责java程序的运行，被称为主线程
    public static void main(String[] args) {
        //创建线程类的对象
        MyThread my=new MyThread();
        //启动线程
        my.start();
        System.out.println("---main方法中的代码---");
        /*在以上代码中，至少有两个线程，一个是主线程，一个是myThread线程*/
    }
}
