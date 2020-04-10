package 线程的常用方法;

/*测试TestMyRunnable2类*/
public class TestMyRunnable2 {
    public static void main(String[] args) {
        //创建线程类的对象
        MyRunnable2 my2=new MyRunnable2();
        //创建代理类Thread类的对象
        Thread t=new Thread(my2);
        System.out.println("线程启动前是否处于活动状态:"+t.isAlive());
        //启动线程
        t.start();;
        System.out.println("线程启动后是否处于活动状态："+t.isAlive());
        //主线程中的代码
        for (int i=0;i<5;i++){
            System.out.println("线程："+Thread.currentThread().getName()+i);
        }
        System.out.println("主线程结束，my2线程是否处于活动状态:"+t.isAlive());
    }
}
