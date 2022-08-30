package monthexam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
/*
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
*/
//        System.out.println(c);

        Iterator<Integer> it = list.iterator();
        //取出所有的元素，一般
        while (it.hasNext()){
            Integer integer = it.next();
           /* String str = (String)it.next();
            System.out.print(str+" ");*/
//            System.out.println(it.next());
            /** Exception in thread "main" java.util.ConcurrentModificationException
                */
            if (integer==2){
                list.remove(integer);
            }

        }
        /*System.out.println();*/
        System.out.println(list);

//        for (int i = 0; i < ; i++) {
//
//        }



    }

}
