package characterBufferStream;

import java.io.*;

/*使用缓冲流提高读取效率*/
public class Test15_22 {
    public static void main(String[] args) throws IOException {
        //创建字节流输入对象
        FileInputStream fis=new FileInputStream("C:\\test\\test15_22.txt");
        //创建转换流对象
        InputStreamReader isd=new InputStreamReader(fis,"utf-8");
        //创建输入缓冲流对象
        BufferedReader br=new BufferedReader(isd);
        //读取数据，每行读取一行
        String str = null;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
        //关闭流
        br.close();
        isd.close();
        fis.close();
    }
}
