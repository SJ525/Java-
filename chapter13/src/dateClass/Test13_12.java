package dateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*比较日期大小*/
public class Test13_12 {
    public static void main(String[] args) throws ParseException {
        String str1="2020年3月1日";
        String str2="2020年4月1日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date date1=sdf.parse(str1);
        Date date2=sdf.parse(str2);
        System.out.println(date1.compareTo(date2));
    }
}
