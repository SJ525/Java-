package collection;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*集合的遍历*/
public class Test14_2 {
    //多态，接口去neW实现类，向上类型转换 coll. add("java")
    Collection coll= new ArrayList();
    @Before
    public void before(){
        //添加元素
        coll.add("java");
        coll.add("html");
        coll.add("sql");
    }

    /*1.使用增强for循环*/
    @Test
    public void testOne(){
        for(Object object:coll){
            System.out.print(object+"\t");
        }
    }
    /*2.使用 iterator 方法*/
    @Test
    public void testTwo(){
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object o=iterator.next();
            System.out.print(o+"\t");
        }
    }
}
