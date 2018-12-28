package cn.gree.lwh;

public class stringTest1 {
    public static void main(String[] args){
        System.out.println("------------------split分隔字符串------------------------");
        String str1 = "111-111-333-444";
        //split分隔时的符号有分特殊符号和普通符号，特殊符号前面加上双斜杠就可转为普通符号
        String[] arrayStr = str1.split("-");
        for (int i = 0;i < arrayStr.length;i++){
            String arrayStr1 = arrayStr[i];
            System.out.println(arrayStr1);
        }
    }
}
