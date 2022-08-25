package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 受元素的euqals 方法影响的集合操作
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
        Collection c = new HashSet();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        c.add(new Point(1,2));

        System.out.println(c);

//        c.getClass();

        /**
         * boolean contains();   受equals影响
         */
        Point p = new Point(1,2);
        boolean contains = c.contains(p);
        System.out.println("是否包含："+ contains);

        c.remove(p);
        System.out.println(c);




    }
}
