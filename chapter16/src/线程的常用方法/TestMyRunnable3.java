package 线程的常用方法;

/*测试TestMyRunnable2类*/
public class TestMyRunnable3 {
    public static void main(String[] args) {
        //创建线程类的对象
        MyRunnable2 my3=new MyRunnable2();
        //创建代理类Thread类的对象
        Thread t=new Thread(my3);
        //启动线程
        t.start();;
        //主线程中的代码
        for (int i=0;i<5;i++){
            //i=2之后强制执行my3线程
            if (i>2){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
