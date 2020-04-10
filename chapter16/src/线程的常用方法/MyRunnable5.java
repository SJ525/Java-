package 线程的常用方法;

/*实现Runnable接口，MyRunnable4具备了多线程操作的能力*/
public class MyRunnable5 implements Runnable{
    @Override
    public void run() {
        //编写线程体
        for (int i=0;i<5;i++){
            if(i==2){
                System.out.println(Thread.currentThread().getName());
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
