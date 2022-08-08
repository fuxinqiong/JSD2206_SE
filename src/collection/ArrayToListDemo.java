package collection;

import java.util.*;

/**
 * 数组转集合
 * asList()
 *
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String []  str = new String[10];
        System.out.println(str);
        System.out.println("str: "+ Arrays.toString(str));

        //数组转换成集合
        List<String> list = Arrays.asList(str);
        System.out.println("list: "+list);
        System.out.println("str: "+ Arrays.toString(str));
        System.out.println();
        /**
         * 数组和集合绑定
         */
        list.set(1,"six");
//        System.out.println();
        System.out.println("list: "+list);
        System.out.println("str: "+ Arrays.toString(str));
        System.out.println();

        str[2] = "seven";
        System.out.println("str: "+ Arrays.toString(str));
        System.out.println("list: "+list);
        System.out.println();

//        list.add("!!!!!!");   //不能增加，因为数组不能做增删动作
//        System.out.println("list: "+list);
//        System.out.println("str: "+ Arrays.toString(str));

        List<String> list2 = new ArrayList<>(list);    //等同于先new一个集合，再addAll()
        Set<String> set = new HashSet<>(list);      //先new一个集合，再去addAall(),再去重
        System.out.println("list2: "+list2);
        list2.add("!!!!!");
        System.out.println("list2: "+list2);
        System.out.println("set: "+set);

    }
}
