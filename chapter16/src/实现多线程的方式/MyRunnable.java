package 实现多线程的方式;

/*MyRunnable实现Runnable接口，MyRunnable就具备了多线程操作的能力*/
public class MyRunnable implements Runnable{
    //必须实现接口中的run()方法
    @Override
    public void run() {
        //编写线程体，线程所要执行的代码
        for (int i=0;i<5;i++){
            System.out.println("MyRunnable类中run方法中的i="+i);
        }
    }
}
