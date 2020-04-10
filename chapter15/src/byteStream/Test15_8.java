package byteStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*使用FileInputStream读取文件中的内容*/
public class Test15_8 {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream的对象，使用父亲创建子类对象
        InputStream is=new FileInputStream("C:\\test\\testA\\test1.txt");
        //查看输入流中估计的字节数
        System.out.println("输入流中估计的字节数："+is.available());
        //使用read())从输入流中读取一个字节
        int b=is.read();
        System.out.println("读到的内容为："+b);
        System.out.println("读到的内容为："+(char)b);
        System.out.println("输入流中剩余的字节数："+is.available());
        is.close();
    }
}
