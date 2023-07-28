package com.object.yac;

public class TestPeople {
    public static void main(String[] args) {
        /*
        定义数组存储4个人的对象.
        女朋友的属性：姓名，年龄，性别，爱好
        要求1：计算出四个人的平均年龄。
        要求2：统计比年龄平均值低的有几个，并把的所有信息他们打印出来。
         */
        People []arr=new People[4];
        People s1=new People("小诗诗",18,"女","打乒乓球");
        People s2=new People("小婷婷",22,"女","唱歌");
        People s3=new People("小王",38,"男","游泳");
        People s4=new People("小李",25,"男","跑步");
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        arr[3]=s4;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            People f=arr[i];
            sum+=f.getAge();
        }
        int avg=sum/arr.length;
        System.out.println(avg);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            People s=arr[i];
            if (s.getAge()<avg){
                System.out.println(s.getName()+","+s.getAge()+","+s.getGender()+","+s.getHobby());
                count++;
            }

        }
        System.out.println(count);
    }
}
