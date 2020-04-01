package dateClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*格式化日期*/
public class Test13_11 {
    public static void main(String[] args) {
        Date date=new Date();
        /*格式化*/
        DateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        String str=dateFormat.format(date);
        System.out.println(str);
    }
}
