package cn.gree.lwh.datedemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);
        System.out.println("----------------------");

        //获得年、月、日、周、小时、分钟、秒钟、毫秒等
        int year = ca.get(Calendar.YEAR);
        int month = ca.get(Calendar.MONTH) + 1;      //中国的计算方法需要加一
        int day = ca.get(Calendar.DAY_OF_MONTH);
        int week_year = ca.get(Calendar.DAY_OF_WEEK);   //一年中的第多少周
        int week_month = ca.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int hour = ca.get(Calendar.HOUR_OF_DAY);
        int minute = ca.get(Calendar.MINUTE);
        int second = ca.get(Calendar.SECOND);
        int ms_second = ca.get(Calendar.MILLISECOND);

        System.out.println(year+"/"+month+"/"+day+" "
                        +hour+":"+minute+":"+second+":"+ms_second);
        System.out.println("一年中第"+ week_year +"周");
        System.out.println("一月中第"+ week_month +"周");

        //设置日历
         ca.set(Calendar.YEAR,2017);
         ca.set(Calendar.MONTH,04);
         ca.set(Calendar.DAY_OF_MONTH,13);
        System.out.println(ca);

        System.out.println("---------获得日历毫秒数----------");
        long ms = ca.getTimeInMillis();
        Date date = new Date();     //转成Date

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(date);  //日历格式化输出
        System.out.println(date);
        System.out.println(str);


    }
}
