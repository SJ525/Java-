package stringClass;

// String类构造方法的使用
public class Test13_4 {
    public static void main(String[] args) {
        /*1.String()*/
        //调用无参构造方法创建一个String类型的对象str1
        String str1=new String();
        System.out.println("str1="+str1);
        /*2.String​(String original)*/
        String str2=new String("hello");
        System.out.println("str2="+str2);
        /*3.String​(char[] value)*/
        char[] chars = {97,98,99};
        String str3=new String(chars);
        System.out.println("str3="+str3);
        /*4.String​(byte[] bytes, int offset, int length)*/
        byte[] bytes={97,98,99};
        String str4=new String(bytes,0,bytes.length);
        System.out.println("str4="+str4);
    }
}
