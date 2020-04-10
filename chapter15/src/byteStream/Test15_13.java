package byteStream;

import java.io.*;

/*使用缓冲字节流复制文件*/
public class Test15_13 {
    public static void main(String[] args) throws IOException {
        //创建缓冲字节输入流对象
        FileInputStream fis=new FileInputStream("C:\\test\\testB\\testB.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        long startTime=System.currentTimeMillis();//开始时间
        //创建缓冲字节输出流对象
        FileOutputStream fos=new FileOutputStream("C:\\test\\testC\\testB.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        long endTime=System.currentTimeMillis();//开始时间
        //进行复制操作
        int length=0;//接收缓冲字节输入流读数
        byte[] buf=new byte[1024];//中转站大小1024kb
        while ((length=bis.read(buf))!=-1){
            bos.write(buf,0,length);//写进缓冲字节输出流
        }
        //时间统计
        System.out.println("文件的复制一共耗时："+(endTime-startTime)+"毫秒");
        bos.close();
        bis.close();
    }
}
