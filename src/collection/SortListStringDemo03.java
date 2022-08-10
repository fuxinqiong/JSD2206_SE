package collection;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 *
 */
public class SortListStringDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");

        //按字符长度来进行排序
        Comparator<Character[]> c = (o1, o2) -> o1.length-o2.length;
//        Collections.sort(list,(o1, o2) -> o1.length()-o2.length());   //升序
//        Collections.sort(list,(o1, o2) -> -o1.length()+o2.length());    //降序
//        Collections.sort(list, Comparator.comparingInt(String::length));
//        System.out.println(list);
        list.sort((o1, o2) -> o1.length()-o2.length());
        System.out.println(list);
    }
}
