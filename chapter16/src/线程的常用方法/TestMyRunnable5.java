package 线程的常用方法;

/*测试MyRunnable5类*/
public class TestMyRunnable5 {
    public static void main(String[] args) {
        //创建线程类的对象
        MyRunnable5 my5=new MyRunnable5();
        //创建代理线程类的对象
        Thread thread = new Thread(my5);
        //启动线程
        thread.start();
    }
}
