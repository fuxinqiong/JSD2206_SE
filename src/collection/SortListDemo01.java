package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * list 集合排序
 */
public class SortListDemo01 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) );
        }
        System.out.println(list);

        //排序从小到大
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
