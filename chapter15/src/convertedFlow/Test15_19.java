package convertedFlow;

import byteStream.PrintFileContent;
import java.io.*;

/*使用转换流将数据写入到文件*/
public class Test15_19 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象，搭建与目的地之间的桥梁
        OutputStream os=new FileOutputStream("C:\\test\\test.txt");
        //创建转换输出流对象，将字符流转换成字节流，写入目的地
        OutputStreamWriter w=new OutputStreamWriter(os,"utf-8");
        //将数据写入目的地
        w.write("北京欢迎你!");
        w.flush();
        //输出文件内容
        PrintFileContent.print("C:\\test\\test.txt");
        w.close();
        os.close();
    }
}
