package set;

import genericity.Person;

import java.util.HashSet;
import java.util.Set;

/*使用HashSet存储自定义对象Person*/
public class Test14_11 {
    public static void main(String[] args) {
        //使用HashSet集合存储自定义对象Person
        Set<Person> set=new HashSet<>();
        //创建4个Person类型的对象
        Person p1=new Person("刘能儿","男");
        Person p2=new Person("赵玉田","男");
        Person p3=new Person("刘英儿","男");
        Person p4=new Person("赵玉田","男");
        //向集合中添加元素
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println("集合中元素的个数:"+set.size());
        System.out.println(set);
    }

}
