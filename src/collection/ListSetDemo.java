package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSetDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();    //链表
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        String old = list.set(2,"six");
        System.out.println(old);
        System.out.println(list);
    }
}
