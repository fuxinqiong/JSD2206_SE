package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * java.util.List 接口
 * 继承collection
 * 可以存放重复元素且有序的集合
 * ArrayList    查询性能更好
 * LinkedList   增删性能更好

 */
public class ListDemo {
    public static void main(String[] args) {
        //新建一个字符串集合<String> 泛型
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        /**
         *  通过下标获取操作元素的方法
         *
         */
        String e = list.get(1);
        System.out.println(e);

        //遍历list 集合
        for (int i = 0; i < list.size(); i++) {
            e = list.get(i);
            System.out.println(e);
        }

        //将给定元素替换到指定位置，
        String old = list.set(1,"changetwo");  //返回值为被替换的元素
        System.out.println(list);
        System.out.println(old);

        /**倒序
         *  1    2    3    4    5
         *  one two three four five
         *
         */
        //第一种方法
        Collections.reverse(list);
        System.out.println(list);
        //第二种方法
        for (int i=0;i<list.size()/2;list.set(i,list.set(list.size()-1-i, list.get(i++)))){

        }
        System.out.println(list);
       //第三种方法
        for (int i = 0; i <list.size()/2 ; i++) {

            //第三种方法
            String e1=list.get(i);
            String e2= list.set(list.size()-1-i,e1);
            list.set(i,e2);

            //第四种方法
//            list.set(i,list.set(list.size()-1-i,e1));


//            String e2 = list.set(i-1,e1);
//            System.out.print(e2);

//            System.out.println();
        }
//        System.out.println();


        System.out.println(list);





    }
}
