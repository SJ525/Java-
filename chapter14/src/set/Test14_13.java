package set;

import java.util.LinkedHashSet;

/*LinkedHashSet的使用*/
public class Test14_13 {
    public static void main(String[] args) {
        //创建LinkedHashSet对象.使用泛型，集合中只能存储String类型
        //String类重写了父类Object类中的hashCode()方法及equals(Object obj)方法去掉重复元素
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        //添加元素
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
        //删除元素
/*        lhs.remove("hello");
        lhs.clear();*/
        //遍历集合
        //使用加强for循环
        for (String str:lhs){
            System.out.print(str+"\t");//默认调用了toString方法
        }
    }
}
