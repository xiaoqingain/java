package com.object.yac;

public class TestStudent {
    public static void main(String[] args) {
        /*
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名都不相同。

         */

        Student[] arr=new Student[3];
        Student stu1=new Student(001,"小王",18);
        Student stu2=new Student(002,"小李",23);
        Student stu3=new Student(003,"小张",32);
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;
        Student stu4=new Student(004,"小lu",25);
    }
}
