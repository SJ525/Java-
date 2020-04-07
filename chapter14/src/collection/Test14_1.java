package collection;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/*Collection接口的基本方法的使用*/
public class Test14_1 {
    /*多态，接口去new实现类，向上类型转换*/
    Collection collection=new ArrayList();
    /*1.add方法，添加元素，一次添加一个对象*/
    @Test
    public void method_1(){
        System.out.println("添加元素之前：集合是否为空:"+collection.isEmpty());
        //1. 5 之后自动装箱，相当于 Object o=new Integer(123)
        collection.add(123);
        collection.add("helloword");
        for (Object o:collection) {
            System.out.println(o.toString());
        }
    }
    /*2.isEmpty()和size()方法*/
    @Test
    public void method_2(){
        collection.add(123);
        collection.add("helloword");
        System.out.println("添加元素之后：集合是否为空:"+collection.isEmpty());
        System.out.println("集合中元素的个数是:"+collection.size());
    }
    /*3.addAll(Collection c)将另一个集合的元素一次性添加到coll中*/
    @Test
    public void method_3(){
        Collection coll=new ArrayList();
        coll.add("java");
        coll.add("html");
        coll.add("sql");
        collection.addAll(coll);
        System.out.println(collection.toString());
    }
    /*4.contains(Object o):判断指定对象在集合中是否存在*/
    @Test
    public void method_4(){
        Collection coll=new ArrayList();
        coll.add("java");
        coll.add("html");
        coll.add("sql");
        collection.addAll(coll);
        System.out.println();
    }
    /*5.equals()用于比较集合中的元素是否相同*/

}



















