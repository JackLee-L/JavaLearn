package cn.gree.lwh.collectiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class ArrayDemo {
    public static void main(String[] args) throws ParseException {
        System.out.println("-----------数组的实现-------------");
        /**
         * 数组：长度固定，课存储基本类型，也可存储对象
         *       数组的数据类型可以是任意类型，则定义数组为Object类型
         */
        //首先传入一个自己制定的时间,在循环中定义变量值时使用
        String str = "1993-03-15";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);

        Object[] obj = new Object[10];
        obj[0] = 1;
        obj[1] = "李四";
        obj[2] = new Student(10,"王五",2,date);
        System.out.println("#########测试数据类型定义-Object类型测试");
        for (int i = 0; i < obj.length; i++) {
//            System.out.println(obj[i]);
        };
        Student[] studs = new Student[10];
        for (int i = 0; i < 10; i++) {
            Student student = new Student(i,"张三" + i,1,new Date());
            studs[i] = student;
        }
        //遍历数组并打印其中的数据
        System.out.println("####正常输出####");
        for (int i = 0; i < studs.length; i++) {
//            System.out.println(studs[i]);
        }

        System.out.println("-----------集合的实现------------");
        System.out.println("-----------add and addAll的实现--------");
        /**
         * 集合：长度可变。
         *       只能存储对象类型（由于包装类的存在，集合也可以存储任何类型）
         */
        //创建两个集合，然后追加到第一个集合中
        Collection coll = new ArrayList();
        for (int i = 0; i < 4; i++) {
            coll.add("张三" + i);
        }
        System.out.println("coll: " + coll);
        Collection coll1 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            coll1.add("李四" + i);
        }
        System.out.println("coll1: " + coll1);

        coll.addAll(coll1);
        System.out.println("coll1追加到coll中：" + coll);

        //集合中可以存放任何类型的数据
        Collection coll2 = new ArrayList();
        coll2.add(1);
        coll2.add(new Student(1,"王五",2,new Date()));
        coll2.add(new Date());
        System.out.println("coll2: " + coll2);

        //集合中存放集合
        /**
         * [[0---集合数据0, 0---集合数据1, 0---集合数据2, 0---集合数据3],
         * [1---集合数据0, 1---集合数据1, 1---集合数据2, 1---集合数据3],
         * [2---集合数据0, 2---集合数据1, 2---集合数据2, 2---集合数据3],
         * [3---集合数据0, 3---集合数据1, 3---集合数据2, 3---集合数据3]]
         */
        Collection coll3 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            Collection coll4 = new ArrayList();
            for (int j = 0; j < 4; j++) {
                coll4.add(i + "---集合数据" + j);
            }
            coll3.add(coll4);
        }
        System.out.println("coll3: " + coll3);

        //创建一个班级的对象
        /**
         * Clazz{clazzId=1, stuNo=2,
         *      col=[Student{id=1, name='李逵', gender=2, birthday=Sun Apr 15 13:55:29 CST 2018},
         *      Student{id=2, name='张飞', gender=1, birthday=Sun Apr 15 13:55:29 CST 2018}]}
         */
        Clazz clazz = new Clazz();
        clazz.setClazzId(1);
        clazz.setStuNo(2);
        //创建两个学生
        Student s1 = new Student(1,"李逵",2,new Date());
        Student s2 = new Student(2,"张飞",1,new Date());
        //创建一个存储学生对象的集合
        Collection cs = new ArrayList();
        cs.add(s1);
        cs.add(s2);
        clazz.setCol(cs);
        System.out.println("clazz: " + clazz);

        System.out.println("------集合中删除的实现---------");
        //删除操作中的clear、remove和removeAll
        System.out.println("coll原本的数据：" + coll);
        /*coll.clear();
        System.out.println("coll删除操作后的数据：" + coll);
        coll.remove("张三1");
        System.out.println("coll删除张三1的数据：" + coll);
        */
        /**
         *coll1原有的数据：
         *      [张三0, 张三1, 张三2, 张三3, 李四0, 李四1, 李四2, 李四3]
         * 从集合中删除一个小集合的内容：
         *      [李四0, 李四1, 李四2, 李四3]
         */
        System.out.println("coll1原有的数据：" + coll);
        Collection coll5 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            coll5.add("张三" + i);
        }
        coll.removeAll(coll5);
        System.out.println("从集合中删除一个小集合的内容：" + coll);

        System.out.println("-------集合中的判断--------");
        //contains、containsAll和isEmpty
        boolean b1 =coll.contains("李四0");
        System.out.println("是否包含“李四0”：" + b1);
        boolean b2 = coll.containsAll(coll5);
        System.out.println("是否包含coll5集合：" + b2);
        boolean b3 = coll.isEmpty();
        System.out.println("是否为空：" + b3);

        //集合转换成为一个数组
        Object[] object = coll.toArray();
        System.out.println("--------------集合转换成数组---------");
        System.out.println("coll: " + coll);;
        System.out.println("转成数组后：");
        for (int i = 0; i < object.length; i++) {
            System.out.print(object[i] + "\t");
        }

    }
}
