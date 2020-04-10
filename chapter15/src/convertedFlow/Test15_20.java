package convertedFlow;

import java.io.*;

/*使用转换流读取磁盘上文件中的内容*/
public class Test15_20 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象，搭建与目的地之间的桥梁
        InputStream is=new FileInputStream("C:\\test\\test.txt");
        //创建输入转换流的对象，使用指定的编码格式
        InputStreamReader isr=new InputStreamReader(is,"utf-8");
        //创建字符数组
        char[] ch=new char[1024];
        //读取内存
        int length=isr.read(ch);
        //判断
        while (length!=-1){
            System.out.println("文件中的内容为："+new String(ch,0,length));
            length=isr.read(ch);
        }
        //关闭流
        isr.close();
    }
}
