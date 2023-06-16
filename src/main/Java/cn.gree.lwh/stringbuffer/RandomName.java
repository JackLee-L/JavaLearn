package cn.gree.lwh.stringbuffer;

import java.util.Random;

public class RandomName {
    public static void main(String[] args) {
        String[] name = {"张三", "李四", "JackeChong", "JackeLee"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("请开始点名！！！");

        /*Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        */

        Random random = new Random();
        int intVal = random.nextInt(4);
        System.out.println(intVal);
        String nameRandom = name[intVal];
        System.out.println(nameRandom);
    }

    }