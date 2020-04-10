package 实现多线程的方式;

//编写线程类，继承Thread类
public class TicketThread extends Thread{

    public TicketThread(String name) {
        super(name);//调用父类Thread类中带参的构造方法
    }
    //共享资源 5 张票
    private int ticket=5;
    //重写run方法
    @Override
    public void run() {
        //编写线程体：100个人排队等待购票
        for (int i=0;i<100;i++){
            //判断是否有票
            if (ticket>0){
                System.out.println(super.getName()+"卖出第"+(ticket--)+"张票");
            }
        }
    }
}
