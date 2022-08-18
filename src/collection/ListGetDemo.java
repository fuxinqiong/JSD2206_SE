package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class ListGetDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();    //链表
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        String s = list.get(0); //获取指定下标的元素，遍历所有的元素
        System.out.println(s);



    }
}
