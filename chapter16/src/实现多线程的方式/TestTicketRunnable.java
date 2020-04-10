package 实现多线程的方式;

public class TestTicketRunnable {
    public static void main(String[] args) {
        //创建线程类的对象
        TicketRunnable tr=new TicketRunnable();
        //创建三个代理类的对象
        Thread t1=new Thread(tr,"A窗口");
        Thread t2=new Thread(tr,"B窗口");
        Thread t3=new Thread(tr,"C窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
