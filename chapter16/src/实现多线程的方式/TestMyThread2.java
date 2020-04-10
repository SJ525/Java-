package 实现多线程的方式;

/*测试MyThread2*/
public class TestMyThread2 {
    public static void main(String[] args) {
        //创建MyThread2线程类的对象
        MyThread2 my2=new MyThread2();
        //启动线程
        my2.start();
        for (int i=0;i<10;i++){
            System.out.println("主方法中的for循环i="+i);
        }
    }
}
