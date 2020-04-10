package 实现多线程的方式;

/*借助Thread类启动线程*/
public class TestMyRunnable {
    public static void main(String[] args) {
        //创建线程类的对象
        MyRunnable myRun=new MyRunnable();
        Thread thread = new Thread(myRun);
        thread.start();
        //主线程中的代码
        for (int i=0;i<5;i++){
            System.out.println("主线程中的代码i="+i);
        }
    }
}
