package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

        //集合转数组
        String[] array = c.toArray(new String[c.size()]);
        System.out.println(array);  //
        System.out.println(Arrays.toString(array));
        System.out.println(c);

        //清除集合中元素
        c.clear();
        System.out.println(c);

        //数组转集合


    }
}
