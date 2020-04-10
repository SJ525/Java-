package fileClass;

import java.io.File;

/*File类对目录操作的方法*/
public class Test15_6 {
    public static void main(String[] args) {
        //创建File类的对象
        String str=File.separator;
        File directory1=new File("C:"+str+"test");
        File directory2=new File("C:"+str+"test"+str+"testA"+str+"testB");
        //如果目录不存在，则创建
        if (!directory1.exists()){
            directory1.mkdir();//创建单层目录 test 即 D:\\test
            directory2.mkdirs();//创建多层目录，即 D\\test\\testA\\testB
        }
        System.out.println("directory1是否是目录:"+directory1.isDirectory());
        //删除目录
        System.out.println("删除TestB："+directory2.delete());
        System.out.println("TestB目录"+directory1.toString());
    }
}
