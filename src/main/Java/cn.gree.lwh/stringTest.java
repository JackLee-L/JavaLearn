package cn.gree.lwh;

import java.util.Scanner;

/**
 * 从控制台输入一段字符串，把首字母变成大写，其余变成小写
 * 分析：
 *      1.获得首字母和除首字母以外的其余字母
 *      2.把首字母变成大写，把其余字母变成小写
 *      3.把大写的字母和小写的字母连接起来
 *
 */
public class stringTest {
    public static void main(String[] args){
        System.out.println("请输入一段字符串：");
        callMethod();
    }

    //解决获得空字符产生的益处错误的办法
    public static void callMethod(){
        try {
            getResult();
        }catch (Exception e){
            System.out.println("请输入字符串：");
            callMethod();
        }
    }

    public static void getResult(){
        Scanner reader = new Scanner(System.in);
        String string = reader.nextLine();
        //注意，此处可能获得的是空字符串，会出现超出界限的错误
        char firstChar = string.charAt(0);
        //获得第一个字符的字符串
        String fierstStr = String.valueOf(firstChar);
        //用字符串去调用toUpperCase()函数
        String fierstUpperStr = fierstStr.toUpperCase();
        //获得剩下的字符串
        String lastStr = string.substring(1);
        //把小写的字母转换成大写字符串
        String lastLowerStr = lastStr.toLowerCase();
        //拼接
        System.out.println(fierstUpperStr.concat(lastLowerStr));

        String convertStr = String.valueOf(fierstStr).toUpperCase()
                                   .concat(string.substring(1).toLowerCase());
        System.out.println(convertStr);

        String resultStr = string.substring(0,1).toUpperCase()
                                    .concat(string.substring(1).toLowerCase());
        System.out.println(resultStr);
    }
}
