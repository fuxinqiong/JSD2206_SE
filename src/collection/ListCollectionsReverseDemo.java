package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollectionsReverseDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();    //链表
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        String old = list.set(0,"1");    //list.set 的返回值是被替换的哪个元素
        for (int i = 0; i < list.size()/2; i++) {       // list.size()/2
            list.set(i,list.set(list.size()-1-i,list.get(i)));

        }
        System.out.println(list);
    }
}
