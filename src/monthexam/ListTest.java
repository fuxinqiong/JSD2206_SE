package monthexam;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("str1");
        list.add(2,"str2");
        String s = list.get(1);
        /** Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 2, Size: 1*/
        System.out.println(s);
    }
}
