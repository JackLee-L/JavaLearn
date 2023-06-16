package cn.gree.lwh.stringbuffer;

import java.util.Random;

/**
 *  随机数
 */
public class random {
    public static void main(String[] args){
        double val = Math.random();
        System.out.println(val);

        //获得1-100的整数
        double val1 = val * 100;
        int val2 = (int) Math.floor(val * 100) + 1;     //floor不管小数点后是多少都加一
        int val3 = (int)Math.ceil(val * 100) + 1;       //floor不管小数点后是多少都减一
        int val4 = (int)(val * 100 + 1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);

        Random r = new Random();
        int intVal = r.nextInt(10);     //在参数范围内随机
        System.out.println(intVal);
    }
}
