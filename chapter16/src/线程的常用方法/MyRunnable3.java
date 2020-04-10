package 线程的常用方法;

/*线程是否处于活动状态*/
public class MyRunnable3 implements Runnable{
    //重写run方法
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("线程："+Thread.currentThread().getName()+i);
        }
    }
}
