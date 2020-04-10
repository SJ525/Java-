package fileClass;

import java.io.File;

/*删除指定文件*/
public class Test15_4 {
    public static void main(String[] args) {
        //创建File类的对象
        File file=new File("C:\\a.txt");
        //删除成功返回true,如果文件在磁盘上不存在，则返回false
        System.out.println(file.delete());
    }
}
