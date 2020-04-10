package fileClass;

import java.io.File;
import java.util.HashSet;

/*File类从父类Object继承过来的方法*/
public class Test15_3 {
    public static void main(String[] args) {
        /*创建File类的对象*/
        /*路径中含有盘符，绝对路径与相对路径的内容相同*/
        File file=new File("C:\\a.txt");
        File file2=new File("C:\\a.txt");
        //默认调用了 toString方法，不再输出内容地址，而输出是相对路径
        System.out.println("file.toString()--->"+file.toString());
        System.out.println("file==file2--->"+(file==file2));
        //重写了 equals(Object obj)方法，用于比较两个对象的内容是否相同
        System.out.println("file.equals(file2)--->"+file.equals(file2));
        //创建HashSet对象
        HashSet<File> hs=new HashSet<>();
        hs.add(file);
        hs.add(file2);
        //重写了 hashCode()方法及equals(Object obj)方法，用于去掉重复数据
        System.out.println("集合中元素的个数:"+hs.size());
    }
}
