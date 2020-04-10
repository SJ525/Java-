package fileClass;

import java.io.File;

/*list()方法与listFiles()方法的区别*/
public class Test15_7 {
    public static void main(String[] args) {
        //创建File类的对象
        File file=new File("C:\\test\\testA");
        /*list()只针对于目录操作，用于获取目录下的所有文件及目录，
        以字符串的形式显示，返回值是String类型的数组*/
        String[] strFile=file.list();
        //遍历数组，得到的每个对象都是String类型的对象
        System.out.println("== list ()得到指定目录下的所有文件和目录的名称==");
        for (String str:strFile){
            //默认调用String类的toString方法，得到的是文件或目录的名称
            System.out.println(str);
        }
        /*listFilesO只针对于目录操作，用于获取目录下的所有文件及目录对象，
        返回值是File类型的数组*/
        System.out.println("==listFiles()得到指定目录下的所有文件或目录的相对路径==");
        File[] files=file.listFiles();
        //遍历数组，得到的是每个File类型的对象，可以使用File对象的属性或方法
        for (File f:files){
            //默认调用的是File类的toString()方法，得到的是相对路径
            System.out.println(f);
        }
    }
}
