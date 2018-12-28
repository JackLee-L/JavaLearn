package cn.gree.lwh.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //获得昨天此刻的时间
        long cms = System.currentTimeMillis();
        long zms = 24 * 60 * 60 * 1000;
        Date zDate = new Date(cms - zms);
        System.out.println(zDate);

        System.out.println("-------------时间格式化---------------------");
        //日期格式化，使用DateFormatter类下面的一个子类来格式化
        SimpleDateFormat sfd = new SimpleDateFormat();
        String str = sfd.format(date);
        System.out.println("默认格式：" + str);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd  E a");
        Date date2 = new Date();
        String str1 = sdf1.format(date2);
        System.out.println(str1);

        //将Date转成String字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  E a " +
                                     "  HH:mm:ss:SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str2 = sdf.format(date);
        System.out.println("当前时间：" + str2);
        //将String字符串转成Date
        String str3 = "2018-04-12 23:20:32";
        try {
            Date date3= sdf2.parse(str3);
            System.out.println("给定时间字符串：" + date3);
            //获得到现在的毫秒数
            long lms = date3.getTime();
            System.out.println("毫秒数：" + lms);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
