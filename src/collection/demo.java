package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);
        /*
            迭代器的常用方法:
            boolean hasNext()
            询问集合是否还有"下一个"元素可供迭代.
            注:迭代器默认开始位置是在集合第一个元素之前,因此第一次调用时判断的就是是否有第一个元素.
            并且无论调用多少次hasNext()方法,迭代器的位置都不会改变.

            E next()
            迭代器向后移动一个位置指向集合下一个元素并将其获取.
         */
        Iterator it = c.iterator();
        System.out.println(it.equals("a"));
        while(it.hasNext()){
            String str = (String)it.next();
            if("#".equals(str)){
//                c.remove(str);//迭代器遍历过程中不得通过集合方法增删元素,否则会抛出异常
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println(c);
    }

}
