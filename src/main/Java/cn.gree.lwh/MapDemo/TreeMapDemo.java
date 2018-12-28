package cn.gree.lwh.MapDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * TreeMap的特点：
 *       有序的（与输入的顺序有关）
 *       有排序功能 ，利用key进行排序
 *       不是线程安全的
 *       key不能为null，key不能重复，值可以有多个null
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String,Person> map2 = new HashMap<String, Person>();
        map2.put("b",new Person(1,"zhangsan",2));
        map2.put("a",new Person(2,"lisi",1));
        System.out.println(map2);

        Map<Person,String> map3 = new HashMap<Person,String>();
        map3.put(new Person(1,"zhangsan",2),"key1");
        map3.put(new Person(2,"lisi",1),"key2");
        map3.put(new Person(3,"zhangsan",2),"key1");
        map3.put(new Person(2,"lisi",2),"key2");
        System.out.println(map3);
    }
}
