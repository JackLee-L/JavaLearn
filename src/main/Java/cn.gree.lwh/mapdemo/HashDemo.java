package cn.gree.lwh.mapdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *Map的实现类HashMap
 * HashMap的特点：
 *      1.HashMap是Map的实现类
 *      2.允许多个null值和一个null键
 *      3.HashMap中的元素没有顺序（跟添加的顺序无关）
 *      4.HashMap不是线程安全的
 */
public class HashDemo {
    public static void main(String[] args) {
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

        //把Map变成线程同步的
        map = Collections.synchronizedMap(map);
    }
}
