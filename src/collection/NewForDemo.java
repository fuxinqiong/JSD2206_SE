package collection;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 增强型for循环
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array1 = new String[5];
        String[] array = {"one","two","three","four","five"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();
        for (String str : array){
            System.out.print(str+" ");
        }

        System.out.println();
//        Collection c = new ArrayList<>();
        //泛型，指定集合的类型为 <String>,
        Collection<String> c = new ArrayList<>();   //迭代器指定的泛型应当与其遍历的集合泛型一致
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");

        //迭代器遍历集合元素
        Iterator<String> it =  c.iterator();
        while (it.hasNext()){
            String str = (String)it.next();
//            String str1 = it.next(); //若迭代器指定了泛型后，可以无需造型
            System.out.print(str+" ");
        }

        System.out.println();
        //新循环，效果与上面一致
//        for (Object obj:c){
//            String str = (String)obj;
//            System.out.print(str+" ");
//        }

        //若指定泛型后，for循环可以如下，若无删除操作可以使用当前的遍历，若有需要使用上面的迭代器
        for (String str :c){
            System.out.println(str);
            str.getBytes(StandardCharsets.UTF_8);

        }
    }
}
