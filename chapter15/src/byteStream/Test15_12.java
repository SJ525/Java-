package byteStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*将字节数组中的内容追加到文件*/
public class Test15_12 {
    public static void main(String[] args) throws IOException {
        //创建文件输出流对象，搭建与目的地的管道
        String filePath="C:\\test\\testA\\test2.txt";
        FileOutputStream fos=new FileOutputStream(filePath,true);
        //将字节数组中的内容写入文件
        byte[] buf=new byte[]{97,98,99};
        fos.write(buf);
        //输出文件内容
        PrintFileContent.print(filePath);
        //关闭流
        fos.close();
    }
}
