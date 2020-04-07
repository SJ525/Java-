package genericity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*使用没有泛型的集合*/
public class Test14_5 {
    List list1=new ArrayList();
    @Test
    public void testOne(){
        list1.add(123);
        list1.add("java");
        list1.add(new Person("张三","男"));
        //遍历输出
        for(Object o:list1){
            System.out.println(o.toString());
        }
    }
}
