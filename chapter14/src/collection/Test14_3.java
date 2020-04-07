package collection;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*List接口常用方法*/
public class Test14_3 {
    List list1=new ArrayList();
    List list2=new ArrayList();
    @Before
    public void before(){
        list1.add("java");
        list1.add("html");
    }
    /*1.add(int index,E element)*/
    @Test
    public void testOne(){
        list1.add(2,"sql");
        System.out.println(list1.toString());
    }
    /*2.addAll(int index,Collection<?extend E> c>)*/
    @Test
    public void testTwo(){
        list2.add("haha");
        list2.add("heihei");
        list1.addAll(list2);
        System.out.println(list1.toString());
    }
}
