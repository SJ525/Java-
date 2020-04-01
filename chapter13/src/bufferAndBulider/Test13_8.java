package bufferAndBulider;

/*创建StringBuffer对象*/
public class Test13_8 {
    public static void main(String[] args) {
        /*实际上是创建一个长度为16的char类型的数组*/
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1);
        /*实际上创建的是一个长度为5 + 16长度的数组*/
        StringBuffer sb2=new StringBuffer("hello");
        System.out.println(sb2);
    }
}
