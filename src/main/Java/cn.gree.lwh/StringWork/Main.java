package cn.gree.lwh.StringWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("请输入要处理的字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Person[] ps = GetPerson.getPerson(str);
        PrintArray.printArray(ps);
    }
}
