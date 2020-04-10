package fileClass;

import java.io.File;

/*与系统有关的默认分隔符*/
public class Test15_5 {
    public static void main(String[] args) {
        //创建File类的对象
        File file=new File("C:"+File.separator+"b.txt");
        System.out.println(file);
    }
}
