package cn.gree.lwh.systemtest;

public class SystemTest {
    public static void main(String[] args){
        int[] intNum = {1,23,153,546,456,8797,2,1456,4};
        int[] intNum1 = {32,326,66,55};
        System.arraycopy(intNum1,1,intNum,3,3);
        for (int i = 0;i < intNum.length;i++){
            System.out.print(intNum[i]+"\t");
        }
        System.out.println();
        System.out.println("------------------------");

        //获得时间，从1970年到现在的时间，单位为毫秒
        long firstTime = System.currentTimeMillis();
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间为："+(endTime - firstTime)+"毫秒");

        //获得给定java值的路径
        String path = System.getProperty("java.home");
        System.out.println(path);
    }
}
