package 实现多线程的方式;

/*继承Thread类，让自定义的类MyThread2具备多线程操作的能力*/
public class MyThread2 extends Thread {
    //重写run方法
    @Override
    public void run() {
        //编写线程体(线程所执行的代码)
        for (int i=0;i<10;i++){
           System.out.println("MyThread2 中的 i="+i);
        }
    }
}
