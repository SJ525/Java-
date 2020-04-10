package 实现多线程的方式;

/*继承Thread类，让自定义的类MyThread具备多线程操作的能力*/
public class MyThread extends Thread {
    //重写run方法
    @Override
    public void run() {
        //)编写线程体(线程所执行的代码)
        System.out.println("MyThread 中的 run 方法中的代码");
    }
}
