package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo4 {
    public static void main(String[] args) {
//        Collection c1 = new ArrayList();
        Collection c1 = new HashSet();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println(c1);

        Collection c2 = new ArrayList<>();
        c2.add("android");
        c2.add("ios");
        System.out.println(c2);

        /** 将c2的所有元素是添加到c1 */
        c1.addAll(c2);
        System.out.println("c1" + c1);
        System.out.println("c2" + c2);

        /** Boolean containsAll() **
         *
         */
        Collection c3 = new ArrayList();
        c3.add("c++");
        c3.add("Android");
        c3.add("php");
        System.out.println("c3"+c3);
        boolean contains = c1.containsAll(c3);  //c1中是否包含c3中的所有元素
        System.out.println(contains);


//        c1.retainAll(c3);       //c1取c3 的交集，c3不变
        c1.removeAll(c3);       //c1删除与c3的交集部分的元素， 即删除c1中与c3的共有元素，c3不变
        System.out.println("c1"+c1);
        System.out.println("c3"+c3);


    }

}