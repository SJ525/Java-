package 线程的常用方法;

/*自定义线程的默认名称*/
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        //获得当前线程对象
        Thread t =Thread.currentThread();
        //输出当前线程的名称和优先级
        System.out.println("当前线程的名称："+t.getName());
        System.out.println(t.getName()+"线程的优先级："+t.getPriority());
    }
}
