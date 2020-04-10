package fileClass;

import java.io.File;
import java.io.IOException;

/*査看文件的相关属性*/
public class Test15_2 {
    public static void main(String[] args) {
        //创建File类的对象
        File file=new File("a.txt");//创建到项目的根目录
        try {
            file.createNewFile();
            System.out.println("获取文件名称："+file.getName());
            System.out.println("获取相对路径："+file.getPath());
            //一个英文占一个字节，一个汉字占两个字节
            System.out.println("获取绝对路径："+file.getAbsolutePath());
            System.out.println("获取文件的大小:"+file.length()+"字节");
            System.out.println("file 对象是否是文件："+file.isFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
