package 实现多线程的方式;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*测试RandomCallable*/
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建任务
        RandomCallable rc=new RandomCallable();
        //创建任务管理器，将任务提交给任务管理器
        FutureTask<String> ft=new FutureTask<>(rc);
        //创建Thread类
        Thread thread = new Thread(ft);
        System.out.println("任务是否已完成:"+ft.isDone());
        //启动线程
        thread.start();
        //获取返回值结果
        System.out.println(ft.get());
        System.out.println("任务是否已完成:"+ft.isDone());
    }
}
