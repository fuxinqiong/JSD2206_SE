package monthexam;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        String s = "code";
        map.put(s,"1");
        /** Map 不能存放重复的key ，因此第二次put操作 只会替换原s的key的值*/
        map.put(s,"2");
        System.out.println(map.size());  /* 元素只有一个 所以size为1 */
    }
}
