package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*并发修改异常的解决方案*/
public class Test14_8 {
    public static void main(String[] args) {
        //创建集合对象，同时明确集合中元素的数据类型
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        for (ListIterator<String> iterator = list.listIterator();iterator.hasNext();){
            String str = iterator.next();
            if("hello".equals(str)){
                //迭代器对象调用添加方法
                iterator.add("java");
            }
        }
        System.out.println(list);
    }
}
