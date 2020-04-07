package map;

import genericity.Person;

import java.util.HashMap;

/*HashMap的基本操作*/
public class Test14_21 {
    public static void main(String[] args) {
        //创建 HashMap 集合对象，key 为 String, value 为 Person
        HashMap<String, Person> hm = new HashMap<>();
        //创建Person对象
        Person p1=new Person("mary","女");
        Person p2=new Person("lili","女");
        Person p3=new Person("jack","男");
        Person p4=new Person("mary","女");
        /*添加元素*/
        hm.put(p1.getName(),p1);
        hm.put(p2.getName(),p2);
        hm.put(p3.getName(),p3);
        hm.put(p4.getName(),p4);
        System.out.println("集合中元的个数："+hm.size());
        System.out.println("lili 在集合中是否存在："+hm.containsKey("lili"));
        System.out.println("p2 在集合中是否存在:"+hm.containsValue(p2));
    }
}
