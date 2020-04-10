package 线程的常用方法;

//线程的常用方法一
public class Test16_10 {
    public static void main(String[] args) {
        //获得当前线程对象
        Thread t=Thread.currentThread();
        //获得当前线程的名称
        System.out.println("当前线程的名称:"+t.getName());
        //获得当前线程的优先级
        System.out.println("当前线程的优先级:"+t.getPriority());
        //线程的最高优先级
        System.out.println("线程的最高优先级:"+Thread.MAX_PRIORITY);
        //线程的最低优先级
        System.out.println("线程的最低优先级:"+Thread.MIN_PRIORITY);
        //线程的默认优先级
        System.out.println("线程的默认优先级:"+Thread.NORM_PRIORITY);
        //修改线程的优先级
        t.setPriority(8);
        //获得当前线程的优先级
        System.out.println("当前线程的优先级:"+t.getPriority());
    }
}
