package stringClass;

import org.junit.Test;

public class Test13_5 {
    /*1.charAt​(int index)的使用*/
    @Test
    public void useCharAt(){
        String str = new String( "abc");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

    /*2.compareTo​(String anotherString)
       从词汇上比较两个字符串。*/
    @Test
    public void useCompareTo(){
        String str1= "apple";
        String str2= "arr";
        System.out.println("str1.compareTo(str2):"+str1.compareTo(str2));
    }

    /*3.compareToIgnoreCase(String str)
    按字典顺序比较两个字符串，忽略大小写差异。*/
    @Test
    public void useCompareToIgnoreCase(){
        String str1= "apple";
        String str2= "APPLE";
        System.out.println("str1.compareToIgnoreCase(str2):"+str1.compareToIgnoreCase(str2));
    }

    /*4.concat​(String str)
    将指定的字符串连接到此字符串的结尾。*/
    @Test
    public void useConcat() {
        String str1= "apple";
        String str2=str1.concat("-iphone");
        System.out.println(str2);
    }

    /*5.contains​(CharSequence s)
    仅当此字符串包含指定的字符值序列时返回true。
    return:boolean*/
    @Test
    public void useContains() {
        String str1= "apple";
        CharSequence s="app";
        boolean isContain=str1.contains(s);
        System.out.println(isContain);
    }
}
