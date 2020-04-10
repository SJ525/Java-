package byteStream;

import java.io.FileInputStream;
import java.io.IOException;

/*封装类：输出文件内容*/
public class PrintFileContent {
    public static void print(String filePath) throws IOException {
        //创建FileInputStream对象，搭建程序与磁盘上的数据源之间的桥梁
        FileInputStream fis=new FileInputStream(filePath);
        //声明int类型的变量，存储从文件中读到的字节的个数,声明byte类型的数组
        int length=0;
        byte[] buf=new byte[1024];
        //使用read(byte [] buf)读取,读到文件的末尾为一1
        length=fis.read(buf);
        //借助String类的构造方法，构造String类型的对象，查看读到的内容
        while (length!=-1){
            System.out.println("文件中的内容为："+new String(buf,0,length));
            length=fis.read(buf);
        }
        //关闭流，关闭流有异常，需要处理
        fis.close();
    }
}
