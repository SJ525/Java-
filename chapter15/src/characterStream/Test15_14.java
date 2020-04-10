package characterStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*使用循环读取数据源文件中的字符*/
public class Test15_14 {
    public static void main(String[] args) throws IOException {
        //创建字符流的对象，搭建与数据源的管道
        Reader r=new FileReader("C:\\test\\testA\\test1.txt");
        //读取数据，按照字符去读取
        int temp;//声明变量，用于存储读到字符的整数值
        StringBuilder sb=new StringBuilder();//一个容器，用于存储字符
        while ((temp=r.read())!=-1){
            char c=(char)temp;//转化为char类型
            sb.append(c);//追加到 StringBuilder 容器中
        }
        //输出StringBuilder中的内容
        System.out.println(sb.toString());
        //关闭流
        r.close();
    }
}
