package cn.gree.lwh.stringwork;

public class GetPerson {
    public static Person[] getPerson(String str){
        Person[] ps = null;    //创建一个Person类的数组来保存
        //做出判断，以免程序抛出字符串空串异常
        if (str != null && !"".equals(str.trim())){
            String[] pstrs = str.split("\\|");  //切割带分隔符的字符串
            ps = new Person[pstrs.length];
            for (int i = 0;i < pstrs.length;i++){   //遍历字符串数组
                String personstr = pstrs[i];    //获得一个person字符串数组
                String[] personArray = personstr.split(":");    //按冒号拆分，存入数组
                Person person = new Person();   //创建一个person保存拆分完成的数据
                person.setIdcard(personArray[0]);
                person.setName(personArray[1]);
                person.setAge(personArray[2]);
                person.setGender(personArray[3]);
                ps[i] = person;

            }

        }
        return ps;
    }
}
