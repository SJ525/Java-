package 实现多线程的方式;

/*测试TicketThread*/
public class TestTicketThread {
    public static void main(String[] args) {
        TicketThread t1=new TicketThread("A窗口");
        TicketThread t2=new TicketThread("B窗口");
        TicketThread t3=new TicketThread("C窗口");
        //启动线程，开始售票
        t1.start();
        t2.start();
        t3.start();
    }
}
