package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        //如果Map的value 是包装类，获取value时要用包装类，避免因自动拆装箱导致空指针
//        int value = map.put("语文",91); //空指针
//        Integer value = map.put("语文",9);    //返回值为null
        map.put("语文",99);
        map.put("数学",91);
        map.put("化学",92);
        map.put("英语",99);
        map.put("物理",93);
        map.put("历史",95);
        System.out.println(map);

        //遍历所有的key
        Set<String> keyset = map.keySet();
        for (String key: map.keySet()){
            System.out.println("key:"+key);
        }
        System.out.println(keyset);

        /**
         * Set<Entry> entrySet()
         */

        Set<Map.Entry<String , Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> e: entrySet){
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":" + value);

        }

        /**
         * Collection values()
         * 将当前Map中的所有value以一个集合形式返回
         *
         */

        Collection<Integer> values = map.values();
        for (Integer value: values){
            System.out.println("value:"+ value);
        }

        /**
         * JDK8之后，集合和Map都提供了forEach 方法，基于lambda表达式遍历
         */



    }
}
