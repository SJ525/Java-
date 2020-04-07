package set;

import java.util.HashSet;
import java.util.Set;

/*HashSet集合的使用*/
public class Test14_9 {
    //接口new实现类，多态的表现形式
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //添加元素
        System.out.println(set.add("java"));
        System.out.println(set.add("html"));
        System.out.println(set.add("sql"));
        System.out.println(set.add("apple"));
        System.out.println(set.add("java"));
        System.out.println("集合的长度："+set.size());
    }
}
