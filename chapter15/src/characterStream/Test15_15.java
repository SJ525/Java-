package characterStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*读取字符到字符数组中*/
public class Test15_15 {
    public static void main(String[] args) throws IOException {
        //创建字符流对象，搭建与数据源之间的桥梁
        Reader reader = new FileReader("C:\\test\\testA\\test1.txt");
        //声明char类型的数组，用于存储读到的内容
        char[] ch=new char[1024];
        //声明int类型的变量用于存储读到取的字符的个数
        int length=reader.read(ch);
        while (length!=-1){
            //借助String类的构造方法查看读到的内容
            System.out.println(new String(ch,0,length));
            length=reader.read(ch);
        }
        //关闭流
        reader.close();
    }
}
