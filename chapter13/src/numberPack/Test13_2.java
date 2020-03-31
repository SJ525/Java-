package numberPack;

/*Integer类常用方法*/
public class Test13_2 {
    public static void main(String[] args) {
        Integer i1=new Integer(123);
        Integer i2=new Integer("123");

        /*(1)toString方法一＞重写Object类的方法*/
        System.out.println("i1="+i1.toString());
        // Integer 类重写了 Object 类中的 toString 方法
        System.out.println("i2="+i2);

        /*(2)equals方法一＞ 重写Object类的方法，用于去比较对象值是否相同*/
        //比较的是内存地址(引用)
        System.out.println("i1==i2:"+(i1==i2));
        //比较的是对象的值
        System.out.println("i1.equals(i2):"+i1.equals(i2));

        /*(3) compareTo 方法一＞实现 Comparable 接口中的方法 0, -1, 1*/
        Integer i3=new Integer( 10);
        System.out.println("i1.compareTo(i3)="+i1.compareTo(i3));

        /*(4) intValue方法，一>将Integer类型的对象转为int类型*/
        //拆箱操作
        int numA= i3.intValue();
        System.out.println("numA="+numA);

        /*(5)parseInt(String s)将 String 转 int */
        int num=Integer.parseInt("123");
        System.out.println("num="+num);
        /*NumberFormatException 异常，在运行产生的，
        所 〃以是运行时异常，可处理也可不处理*/
        //int num=Integer.parseInt("ABC");

        /*(6)进制的转换*/
        //转成二进制
        String strB=Integer.toBinaryString(5);
        System.out.println("strB="+strB);
        //转成 16 进制
        String strH=Integer.toHexString(123);
        System.out.println("strH="+strH);

        /*(7) valueOf(int i) ,valueOf(String s)转成 Integer 类*/
        Integer ii=Integer.valueOf(10);
        Integer ii2=Integer.valueOf("10");
        System.out.println("ii="+ii+"\n"+"ii2="+ii2);
    }
}
