package cn.gree.lwh.mapdemo;

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable的特点：
 *      HashTable是Map的实现类
 *      不允许任何null值和null键
 *      HashTable中的元素没有顺序（与输入的顺序无关）
 *      HashTable是线程安全的
 */
public class HashTableDemo {
    public static void main(String[] args) {
//定义一个Map
        Map<String,String> map = new Hashtable<String, String>();
        //放入键值对
        map.put("及时雨","宋江");
        map.put("行者","武大郎");
        map.put("行者","武松");
        map.put("","");
        map.put("孙行者","");
        map.put("者行孙","");
        map.put("呼保义","宋江");
        System.out.println(map);
    }
}
