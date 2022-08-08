package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add("#");
        c.add("one");
        c.add("#");
        c.add("two#");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        c.add("#");
        System.out.println(c);

        Iterator it = c.iterator();
        //取出所有的元素，一般
        while (it.hasNext()){
            String str = (String)it.next();
            System.out.print(str+" ");
//            System.out.println(it.next());
            if ("#".equals(str)){
                it.remove();
            }

        }
        System.out.println();
        System.out.println(c);

//        for (int i = 0; i < ; i++) {
//
//        }



    }
}
