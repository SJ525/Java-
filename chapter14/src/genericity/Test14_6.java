package genericity;

import java.util.ArrayList;
import java.util.List;

/*在集合中使用泛型*/
public class Test14_6 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("123");
        list1.add("java");
        list1.add((new Person("张三","男")).toString());
        //遍历输出
        for(String str:list1){
            System.out.println(str.toString());
        }
    }
}
