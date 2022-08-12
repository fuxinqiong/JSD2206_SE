package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map    查找表
 *
 * Map是一个接口，常用的实现类：
 * java.util.HashMap:散列表，哈希表
 * 散列表是当今查询速度最快的数据结构，被大量应用于缓存服务器中
 *
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        //如果Map的value 是包装类，获取value时要用包装类，避免因自动拆装箱导致空指针
//        int value = map.put("语文",91); //空指针
        Integer value = map.put("语文",9);    //返回值为null
        map.put("语文",99);
        map.put("数学",99);
        map.put("化学",99);
        map.put("英语",99);
        map.put("物理",99);
        map.put("历史",99);
        System.out.println(map);
        System.out.println(value);

        /**
         * get(Object key)
         * 根据给定的key获取对应的value，如果给的value在map中不存在，则返回值为null
         *
         */
        value = map.get("数学");
        System.out.println("数学："+value);
        value = map.get("体育");
        System.out.println(value);

        /**
         * remove（Object key）
         *
         */
        value =map.remove("英语");
        System.out.println(map);
        System.out.println(value);

        int size = map.size();      //获取map中的元素个数（键值对个数）
        System.out.println("siza:"+size);

        boolean ck = map.containsKey("数学");
        System.out.println(ck);
        boolean cv = map.containsValue(90);
        System.out.println(cv);



    }
}
