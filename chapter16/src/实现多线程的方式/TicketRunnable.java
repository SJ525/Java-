package 实现多线程的方式;

/*编写线程类实现Runnable接口*/
public class TicketRunnable implements Runnable{
    //共享资源5张票
    private  int ticket=5;
    @Override
    public void run() {
        //编写线程体
        //100个人排队等待购票
        for (int i=0;i<100;i++){
            //判断是否有票
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖出第"+(ticket--)+"张票");
            }
        }
    }
}
