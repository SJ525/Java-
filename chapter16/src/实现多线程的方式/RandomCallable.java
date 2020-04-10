package 实现多线程的方式;

import java.util.concurrent.Callable;

/*实现Callable接口使用了泛型String*/
public class RandomCallable implements Callable {

    @Override
    public Object call() throws Exception {
        //创建一个长度为5的String类型的数组
        String[] array=new String[]{"apple","banana","orange","grape","pear"};
        //产生一个 1 〜4 之间的随机数
        int random=(int)(Math.random()*4)+1;
        //根据产生的随机数获取数组中对应位置上的字符串
        return array[random];
    }
}
