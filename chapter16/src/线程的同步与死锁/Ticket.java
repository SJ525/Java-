package 线程的同步与死锁;

/*多线程操作购票*/
public class Ticket implements Runnable{
    private int ticket=5;//5张票

    @Override
    public void run() {
        //编写线程体
        for (int i=0;i<100;i++){
            if (ticket>0){
                try {
                    //添加线程的休眠，提高多线程操作的“错误率”
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖第"+(ticket--)+"张票");
            }
        }
    }
}
