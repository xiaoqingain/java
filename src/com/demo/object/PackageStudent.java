package com.demo.object;

public class PackageStudent {
    public static void main(String[] args) {
        Student1 stu=new Student1();
        stu.name="小诗诗";
        stu.setAge(19);
        System.out.println(stu.getAge());
    }
}
class Student1{
    /**属性-成员变量*/
    String name;
    private int age;
    public void setAge(int a){
        if (a >0) {
            age=a;
        }else {
            System.out.println("您输入的年龄有误");
        }
    }
    public int getAge(){
        return age;
    }

}