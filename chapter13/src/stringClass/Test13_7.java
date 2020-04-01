package stringClass;

public class Test13_7 {
    public static void main(String[] args) {
        String str1="abc";
        String str2=new String("abc");
        String str3=str1+"";
        String str4="abc"+"";
        String str5="a"+"b"+"c";
        System.out.println("str1==str2:"+(str1==str2));
        System.out.println("str1==str3:"+(str1==str3));
        System.out.println("str1==str4:"+(str1==str4));
        System.out.println("str1==str5:"+(str1==str5));
    }
}
