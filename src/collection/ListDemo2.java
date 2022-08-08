package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * list 重载了一对add、和remove 方法
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        /**
         * 集合中插入一个元素
         * add()
         */
        list.add(3,"six");
        System.out.println(list);

        /**
         * 删除指定的位置的元素，并返回被删除的元素
         * remove()
         */
        list.remove(3);
        System.out.println(list);


    }
}
