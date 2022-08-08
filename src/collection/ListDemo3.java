package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * list 提供了获取子集的操作
 */
public class ListDemo3 {
    public static void main(String[] args) {
     //泛型只能有引用类型，对于基本类型而言要使用包装类
        List<Integer>   list  = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        System.out.println(list);

        //获取下标为3-7 的元素，
        List<Integer> sublist = list.subList(3,8);
        System.out.println(sublist);
/*        for (int i = 0; i < sublist.size(); i++) {
            int i1 = sublist.get(i);
            int i2 = sublist.set(i1,i*10);
//            list.add(i,i2);


            System.out.println(i1);
            System.out.println(i2);

        }
        System.out.println(sublist);

 */


        //将每个元素扩大10倍
        /**
         *  1   2  3  4
         *  10 20 30 40
         */

/*        for (int i = 0; i < list.size(); i++) {
            int i1 = list.get(i);
            int i2 = list.set(i1,i*10);
//            list.add(i,i2);


            System.out.println(i1);
            System.out.println(i2);

        }
        System.out.println(list);

 */
        //删除集合中2-8
        List<Integer> sublist1 = list.subList(2,9);
        list.removeAll(sublist1);     //删除子集
//        list.subList(2,9).clear();    //清除子集中元素
        System.out.println(list);
    }
}
