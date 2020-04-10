package 线程的常用方法;

/*测试MyRunnable类*/
public class TestMyRunnable {
    public static void main(String[] args) {
        //创建三个线程对象
        MyRunnable my1=new MyRunnable();
        MyRunnable my2=new MyRunnable();
        MyRunnable my3=new MyRunnable();
        //启动线程
        new Thread(my1).start();
        new Thread(my2).start();
        new Thread(my3).start();
    }
}
