package cn.gree.lwh.MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHasMap的特点：
 *      LinkedHasMap是Map的实现类
 *      允许多个null值和一个null键
 *      LinkedHashMap有顺序（跟添加的顺序有关）
 *      LinkedHashMap不是线程安全的
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //定义一个Map
        Map<String,String> map = new LinkedHashMap<String, String>();
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
