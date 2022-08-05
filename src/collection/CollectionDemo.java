package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java集合框架
 * java.util.Collection 超类接口
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Collection d = new ArrayList();
//        int a = {};

        c.add("1");
        c.add("er");
        c.add("三");
        c.add("2+2");
        c.add("1/2");
        c.add("skdfla_ajf");
//        c.add();  //数组
        System.out.println(c);

        /**
         * 返回当前集合元素个数
         */
        int size  = c.size();
        System.out.println("size"+size);

        //判断当前集合是否为空
        boolean isEmpty = c.isEmpty();   //c==null;
        System.out.println("是否为空："+ isEmpty);
        System.out.println(d==null);

        //清空集合
        c.clear();
        System.out.println("集合已清空");
        System.out.println(c);
        System.out.println("size: "+size);
        System.out.println("是否为空：" +isEmpty);






    }
}
