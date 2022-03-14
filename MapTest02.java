package MapLearn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map集合的遍历
public class MapTest02 {
    public static void main(String[] args) {
       //1.第一种方法：获取所有的key，通过遍历所有的key，来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3,"wangwu");
        map.put(4, "zhaoliu");
        //获取所有的key，所有的key是一个Set集合，所以可以使用迭代器
        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            //取出其中一个key
            Integer key =it.next();
            //通过key获取value
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("-------------------------------------");

        //第二种方法：Set<Map.Entry<K,V>> entrySet()
        //以上方法是把Map集合全部换成Set集合
        //Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //遍历Set集合，每次取出一个Node
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        while(it2.hasNext()){
             Map.Entry<Integer,String> node = it2.next();
             Integer key = node.getKey();
             String value =node.getValue();
            System.out.println(key+"="+value);

        }
        //这种方式效率比较高，因为获取key和value都是直接从node对象中获取的属性值
        //这种方式比较适合于大数据量


    }
}
