package cn.gree.lwh.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 描述：map和collection的区别：
 *          Map集合是键值对的集合，Collection集合是单一出现的数据的集合
 *          Map的键是唯一的，而Collection的子接口List集合中的元素是可以重复的，只有set是唯一的
 *          Map是成对出现的，Collection是单一出现的
 *      Map的特点：
 *          数据承兑出现
 *          数据的键是唯一的
 *          一个键只能对应一个值
 *          值是可以重复的
 *          键允许一个为空，值可以多个是空
 */
public class MapDemo {
    public static void main(String[] args) {
        System.out.println("============================");
        //定义一个Map
        Map<String,String> map = new HashMap<String, String>();
        //放入键值对
        map.put("及时雨","宋江");
        map.put("行者","武大郎");
        map.put("行者","武松");
        map.put("","");
        map.put("孙行者","");
        map.put("者行孙","");
        map.put("呼保义","宋江");
        System.out.println(map);

        //在创建一个Map，把此Map的内容放入到上一个Map中
        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("乱世枭雄","曹操");
        map1.put("乱世英雄","刘备");
        map.putAll(map1);
        System.out.println(map);

        //清空Map，Map.clear();按键值对删除
        map1.clear();
        System.out.println(map1);
        map.remove("者行孙");
        System.out.println(map);

        String value = map.get("乱世枭雄");
        System.out.println("根据指定的键来获得其对应的值:" + value);

        Set<String> set = map.keySet();
        System.out.println("拿到map中的所有key：" + set);

        //根据key的集合获得每一个key所对应的value
        for (String key : set) {
            String value1 = map.get(key);
            System.out.println("根据当前的key来获得对应的value值：" + value1);
        }

        System.out.println("===========================");
        //创建一个以字符串作为key，Person对象作为值的集合
        Map<String,Person> map2 = new HashMap<String, Person>();
        map2.put("key1",new Person(1,"zhangsan",2));
        map2.put("key2",new Person(2,"lisi",1));
        System.out.println(map2);

        Map<Person,String> map3 = new HashMap<Person,String>();
        map3.put(new Person(1,"zhangsan",2),"key1");
        map3.put(new Person(2,"lisi",1),"key2");
        System.out.println(map3);

        System.out.println("=============是否包含==============");
        boolean isCon = map2.containsKey("key3");
        System.out.println("是否包含已存在的key值：" + isCon);
        boolean isCon1 = map2.containsKey("key2");
        System.out.println("是否包含不存在的key值：" + isCon1);
        boolean isConValue = map2.containsValue(new Person(1,"zhangsan",2));
        System.out.println("是否包含已存在的value值：" + isConValue);

        //判断是否为空
        map1.clear();
        boolean isEmpty = map1.isEmpty();
        System.out.println("判断是否为空：" + isEmpty);
        Set<String> keys = map2.keySet();
        for (String key : keys) {
            Person person1 = map2.get(key);
            System.out.println(person1);
        }
        //获得键值对set集合
        Set<Map.Entry<String,Person>> entries = map2.entrySet();
        for (Map.Entry<String,Person> sp : entries) {
            //获得一个项中的key和value
            String key = sp.getKey();
            Person value1 = sp.getValue();
            System.out.println("键：" + key + "值：" + value1);
        }
    }
}
