package characterStream;

import byteStream.PrintFileContent;

import java.io.*;

/*向目的地写入字符*/
public class Test15_16 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象，搭建与目的地的桥梁
        String filePath="C:\\test\\testA\\test2.txt";
        Writer w = new FileWriter(filePath);
        //向目的地写入一个字符
        w.write(97);
        //向目的地写入一串字符
        w.write("hello world");
        //关闭流
        w.close();
        //输出文件内容
        PrintFileContent.print(filePath);
    }
}
