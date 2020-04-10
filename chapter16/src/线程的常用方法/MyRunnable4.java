package 线程的常用方法;

/*实现Runnable接口，MyRunnable4具备了多线程操作的能力*/
public class MyRunnable4 implements Runnable{
    @Override
    public void run() {
        //编写线程体
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
