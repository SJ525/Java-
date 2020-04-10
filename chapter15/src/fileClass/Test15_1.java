package fileClass;

import java.io.File;
import java.io.IOException;

/*创建一个新文件*/
public class Test15_1 {
    public static void main(String[] args) {
        /*在c盘创建一个a. txt的文件*/
        File file=new File("C:\\a.txt");
        //判断a. txt在磁盘上是否存在
        //如果不存在，则创建一个a. txt文件
        if (!file.exists()){
            try {
                System.out.println(file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
