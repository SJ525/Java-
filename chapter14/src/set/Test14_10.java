package set;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*HashSet集合元素的判断及遍历*/
public class Test14_10 {
    //初始化集合和数据
    Set<String> set = new HashSet<>();
    @Before
    public void init(){
        //添加元素
        set.add("java");
        set.add("html");
        set.add("sql");
        set.add("apple");
    }
    @Test
    public void testDel(){
        //remove(Object o)
        set.remove("java");
        //set.clear();
        System.out.println(set);
    }
    /*使用增强for*/
    @Test
    public void testOne(){
        for (String str:set){
            System.out.println(str);
        }
    }
    /*使用iterator*/
    @Test
    public void testTwo(){
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
