package 线程的常用方法;

/*测试MyRunnable4类*/
public class TestMyRunnable4 {
    public static void main(String[] args) {
        //创建线程类的对象
        MyRunnable4 my4=new MyRunnable4();
        //创建代理线程类的对象
        Thread t=new Thread(my4);
        //启动线程
        t.start();
    }
}
