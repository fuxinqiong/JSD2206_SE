package homeworkday01.day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 将整数1-100存入一个List集合中并输出
 * 之后将集合中40-60的元素翻转后并输出
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }
        System.out.print(list);

        System.out.println();
        List<Integer> sublist = list.subList(40,61);
        System.out.println(sublist);
        Collections.reverse(sublist);
/*
        for(Integer i: sublist){
            Integer integer  = i;

            sublist.set(sublist.get(i), list.)
        }
*/
        for (int i=0;i<list.size()/2;list.set(i,list.set(list.size()-1-i, list.get(i++)))){

        }
/*
        for (int i=0;i<sublist.size()/2;sublist.set(i,sublist.set(sublist.size()-1-i, sublist.get(i++)))){

        }
*/

        System.out.println(sublist);
        System.out.println(list);

    }
}
