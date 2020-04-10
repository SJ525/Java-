package byteStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*向文件中写入一个字节*/
public class Test15_11 {
    public static void main(String[] args) throws IOException {
        //创建文件输出流对象，搭建与目的地的管道
        String filePath="C:\\test\\testA\\test2.txt";
        FileOutputStream fos=new FileOutputStream(filePath);
        //向文件中写入一个字节
        fos.write(97);
        //输出文件内容
        PrintFileContent.print(filePath);
        //关闭流
        fos.close();
    }
}
