package numberPack;

/*自动拆装箱*/
public class Test13_3 {
    public static void main(String[] args) {
        //自动装箱
        Integer i1=127;
        Integer i2=127;
        //自动拆箱
        int i=i1;
        System.out.println("i1==i2:"+(i1==i2));
        System.out.println("i="+i);
    }
}
