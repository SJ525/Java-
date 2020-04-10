package byteStream;

import java.io.FileInputStream;
import java.io.IOException;

/*使用循环读取文件中的全部内容*/
public class Test15_9 {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象，搭建程序与磁盘上的数据源之间的桥梁
        FileInputStream fis=new FileInputStream("C:\\test\\testA\\test1.txt");
        //声明int类型的变量，用于存储读到的字节，初始值为0
        int b=0;
        //使用循环依次读取文件中的内容
        //如果读到的内容不等于一1,说明没有达到文件末尾
        while ((b=fis.read())!=-1){
            //查看读到的内容
            System.out.println(b+"--->"+(char)b);
        }
        System.out.println("输入流中剩余的字节数："+fis.available());
        //关闭流，关闭流有异常，需要处理
        fis.close();
    }
}
