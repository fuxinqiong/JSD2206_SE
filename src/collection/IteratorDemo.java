package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历
 * Collection提供了方法:
 * Iterator iterator()
 * 该方法可以获取遍历当前集合元素的迭代器
 *                       die
 * java.util.Iterator接口,迭代器接口,规定了遍历集合的相关操作.
 * 使用迭代器遍历集合遵循的步骤为:
 * 问->取->删  其中删除元素不是必要操作
 *
 * 不同的集合都提供了遍历自身元素的迭代器实现类,我们无需记住它们的名字,当做Iterator使用即可.
 */
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
