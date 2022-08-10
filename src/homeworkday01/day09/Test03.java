package homeworkday01.day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

/**
 * 生成10个0-100之间的不重复的随机数，并输出
 */
public class Test03 {
    public static void main(String[] args) {
        Random random = new Random();
        Collection<Integer> c = new HashSet();
        for (int i = 0; i < 10; i++) {
            int a =random.nextInt(100);
            c.add(a);
        }
        System.out.println(c);
    }
}
