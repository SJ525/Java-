package characterBufferStream;

import byteStream.PrintFileContent;

import java.io.*;

/*使用缓冲流提高写入效率*/
public class Test15_21 {
    public static void main(String[] args) throws IOException {
        //创建字节流对象
        FileOutputStream fos=new FileOutputStream("C:\\test\\test15_21.txt");
        //创建转换流对象
        OutputStreamWriter isw=new OutputStreamWriter(fos,"utf-8");
        //创建缓冲流对象
        BufferedWriter bw=new BufferedWriter(isw);
        //写入数据
        bw.write("北京欢迎你！");
        bw.newLine();//换行
        bw.write("welcome to beijing");
        //关闭流对象，与创建流对象的顺序相反
        bw.close();
        isw.close();
        fos.close();
        //输出文件内容
        PrintFileContent.print("C:\\test\\test15_21.txt");
    }
}
